package fachada.subsistemas;

public class DVDPlayer{
	private String dvdPlayer;
	private Filme filme;
	
	public DVDPlayer(String dvdPlayer){
		this.dvdPlayer = dvdPlayer;
	}	
	
	public void ligar(){
		System.out.println("DVDPlayer ligado.");
	}
	
	public void desligar(){
		System.out.println("DVDPlayer desligado.");
	}
	
	public void play(Filme filme){
		this.filme = filme;
		filme.reproduzir();
	}
	
	public void parar(){
		filme.parar();
	}
}