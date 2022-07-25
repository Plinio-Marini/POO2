package fachada.subsistemas;

public class Tela {
    private String nome;

    public Tela(String nome){
        this.nome = nome;
    }

    public void descer(){
        System.out.println("Tela baixo!");
    }

    public void subir(){
        System.out.println("Tela cima!");
    }
}
