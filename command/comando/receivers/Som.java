package comando.receivers;

public class Som {
    public int volume;

    public void ligar(){
        System.out.println("Som ligado");
    }

    public void desligar(){
        System.out.println("Som desligado");
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
