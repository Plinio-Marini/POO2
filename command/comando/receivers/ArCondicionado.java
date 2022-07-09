package comando.receivers;

public class ArCondicionado {
    public float temperatura;

    public void ligar(){
        System.out.println("Ar ligado");
    }
    public void desligar(){
        System.out.println("Ar desligado");
    }

    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }

}
