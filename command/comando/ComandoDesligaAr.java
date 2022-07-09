package comando;

import comando.receivers.ArCondicionado;

public class ComandoDesligaAr implements Comando{
    public ArCondicionado ar;

    public ComandoDesligaAr(ArCondicionado ar){
        this.ar = ar;
    }

    public void executar(){
        ar.desligar();
    }
    
}
