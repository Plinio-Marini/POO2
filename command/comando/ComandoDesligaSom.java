package comando;

import comando.receivers.Som;

public class ComandoDesligaSom implements Comando{
    public Som som;

    public ComandoDesligaSom(Som som){
        this.som = som;
    }

    public void executar(){
        som.desligar();
    }
}
