package fachada.subsistemas;

public class Amplificador{
	private String amp;
	private int volume;
	private DVDPlayer dvdPlayer;
	private CDPlayer cdPlayer;
	
	public Amplificador(String amp){
		this.amp = amp;
	}
	
	public void ligar(){
		System.out.println("Amplificador ligado.");
	}
	
	public void desligar(){
		System.out.println("Amplificador desligado.");
	}
	
	public void setDVD(DVDPlayer dvdPlayer){
		this.dvdPlayer = dvdPlayer;
	}
	
	public void setCD(CDPlayer cdPlayer){
		this.cdPlayer = cdPlayer;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}
}