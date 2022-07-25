package fachada.subsistemas;

public class Projetor {
    private DVDPlayer input;
    private String nome;

    public Projetor(String nome){
        this.nome = nome;
    }

    public void setInput(DVDPlayer input){
        this.input = input;
    }

    public void ligar(){
        System.out.println("Projetor ligado!");
    }

    public void desligar(){
        System.out.println("Projetor desligado!");
    }
}
