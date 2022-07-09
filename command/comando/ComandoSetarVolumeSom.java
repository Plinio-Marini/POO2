package comando;

import comando.receivers.Som;

public class ComandoSetarVolumeSom implements Comando{
    public Som som;
    public int volume;

    public ComandoSetarVolumeSom(Som som, int volume){
        this.som = som;
        this.volume = volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void executar(){
        som.setVolume(volume);
    }
}
