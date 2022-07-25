package fachada.subsistemas;

public class CD{
	private String nome;
	private int duracao;
	
	public CD(String nome, int duracao){
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public void reproduzir(){
		System.out.println("Reprodução iniciada.");
	}
	public void parar(){
		System.out.println("Reprodução parada.");
	}
}