package comando;

import comando.receivers.Forno;

public class ComandoLigaForno implements Comando{
    public Forno forno;

    public ComandoLigaForno(Forno forno){
        this.forno = forno;
    }

    public void executar(){
        forno.ligar();
    }
}
