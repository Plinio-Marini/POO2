package fachada.subsistemas;

public class Luz {
    private int intensidade;

    public Luz(int intensidade){
        this.intensidade = intensidade;
    }

    public void setIntensidade(int intensidade){
        this.intensidade = intensidade;
    }

    public void ligar(){
        System.out.println("Luz ligada!");
    }

    public void desligar(){
        System.out.println("Luz desligada!");
    }
}
