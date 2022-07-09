package comando;

import comando.receivers.Forno;

public class ComandoSetarTimerForno implements Comando{
    public Forno forno;
    public float timer;

    public ComandoSetarTimerForno(Forno forno, float timer){
        this.forno = forno;
        this.timer = timer;
    }

    public void setTimer(float timer){
        this.timer = timer;
    }

    public void executar(){
        forno.setTimer(timer);
    }
}
