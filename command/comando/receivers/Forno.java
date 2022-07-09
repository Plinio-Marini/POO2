package comando.receivers;

public class Forno {
    public float temperatura;
    public float timer;

    public void ligar(){
        System.out.println("Forno ligado");
    }

    public void desligar(){
        System.out.println("Forno desligado");
    }

    public void setTimer(float timer){
        this.timer = timer;
    }

    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }
}
