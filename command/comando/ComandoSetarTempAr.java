package comando;

import comando.receivers.ArCondicionado;

public class ComandoSetarTempAr implements Comando{
    public ArCondicionado ar;
    public float temp;

    public ComandoSetarTempAr(ArCondicionado ar, float temp){
        this.ar = ar;
        this.temp = temp;
    }

    public void setTemp(float temp){
        this.temp = temp;
    }

    public void executar(){
        ar.setTemperatura(temp);
    }
}
