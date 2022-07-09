import comando.*;
import comando.Comando.*;

public class Controle {
    public Comando[] comandosOn;
    public Comando[] comandosOff;
    private ComandoVazio comandoVazio;

    public Controle(int numeroDeReceivers){
        comandosOn = new Comando[numeroDeReceivers];
        comandosOff = new Comando[numeroDeReceivers];
        comandoVazio = new ComandoVazio();

        for(int i = 0; i < numeroDeReceivers; i++){
            comandosOn[i] = comandoVazio;
            comandosOff[i] = comandoVazio;
        }
    }

    public void pressionarOn(int slot){
        comandosOn[slot - 1].executar();
    }

    public void pressionarOff(int slot){
        comandosOff[slot - 1].executar();
    }

    public void setComando(int slot, Comando on, Comando off){
        comandosOn[slot - 1] = on;
        comandosOff[slot - 1] = off;
    }
}
