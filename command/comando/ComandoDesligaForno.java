package comando;

import comando.receivers.Forno;

public class ComandoDesligaForno implements Comando{
    public Forno forno;

    public ComandoDesligaForno(Forno forno){
        this.forno = forno;
    }

    public void executar(){
        forno.desligar();
    }
}
