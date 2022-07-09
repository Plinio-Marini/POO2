package comando;

import comando.receivers.Forno;

public class ComandoSetarTempForno implements Comando{
    public Forno forno;
    public float temp;

    public ComandoSetarTempForno(Forno forno, float temp){
        this.forno = forno;
        this.temp = temp;
    }
    
    public void setTemp(float temp){
        this.temp = temp;
    }

    public void executar(){
        forno.setTemperatura(temp);
    }
}
