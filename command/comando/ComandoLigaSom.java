package comando;

import comando.receivers.Som;

public class ComandoLigaSom implements Comando{
    public Som som;

    public ComandoLigaSom(Som som){
        this.som = som;
    }

    public void executar(){
        som.ligar();
    }
}
