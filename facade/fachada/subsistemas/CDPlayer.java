package fachada.subsistemas;

public class CDPlayer{
	private String cdPlayer;
	private CD cd;
	
	public CDPlayer(String cdPlayer){
		this.cdPlayer = cdPlayer;
	}
	
	public void ligar(){
		System.out.println("CDPlayer ligado.");
	}
	
	public void desligar(){
		System.out.println("CDPlayer desligado.");
	}
	
	public void play(CD cd){
		this.cd = cd;
		cd.reproduzir();
	}
	
	public void parar(){
		cd.parar();
	}
}