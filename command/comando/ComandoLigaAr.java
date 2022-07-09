package comando;

import comando.receivers.ArCondicionado;

public class ComandoLigaAr implements Comando{
    public ArCondicionado ar;

    public ComandoLigaAr(ArCondicionado ar){
        this.ar = ar;
    }

    public void executar(){
        ar.ligar();
    }
}
