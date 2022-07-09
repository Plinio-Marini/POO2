package comando;

import comando.receivers.PanelaEletrica;

public class ComandoPanela implements Comando{
    public PanelaEletrica panela;

    public ComandoPanela(PanelaEletrica panela){
        this.panela = panela;
    }

    public void executar(){
        panela.ligar();
    }
}
