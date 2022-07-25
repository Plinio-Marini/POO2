package fachada;
import fachada.subsistemas.*;

public class HomeTheater {
	private Amplificador amplificador;
	private CDPlayer cdPlayer;
	private DVDPlayer dvdPlayer;

	private Projetor projetor;
	private Tela tela;
	private Luz luz;
	
	
	public HomeTheater(Amplificador amplificador, CDPlayer cdPlayer, DVDPlayer dvdPlayer, Projetor projetor, Tela tela, Luz luz){
		this.amplificador = amplificador;
		this.cdPlayer = cdPlayer;
		this.dvdPlayer = dvdPlayer;
		this.projetor = projetor;
		this.tela = tela;
		this.luz = luz;
	}
	
	public void assistirFilme(Filme filme){
		amplificador.ligar();
		amplificador.setDVD(dvdPlayer);

		luz.desligar();
		tela.descer();

		projetor.ligar();
		projetor.setInput(dvdPlayer);

		dvdPlayer.ligar();
		dvdPlayer.play(filme);
	}

	public void pararFilme(){
		dvdPlayer.parar();
		luz.ligar();
		tela.subir();
		projetor.desligar();
		dvdPlayer.desligar();
	}
	
	public void ouvirCD(CD cd){
		amplificador.ligar();
		amplificador.setCD(cdPlayer);
		cdPlayer.ligar();
		cdPlayer.play(cd);
	}

	public void pararCD(){
		cdPlayer.parar();
	}
}