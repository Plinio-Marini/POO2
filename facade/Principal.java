/*Autor: Leonardo Marques Ferreira(Matrícula: 11921BSI235)*/
import fachada.*;
import fachada.subsistemas.*;

public class Principal{
	public static void main(String[] args){
		Amplificador amp = new Amplificador("teste amp");
		CDPlayer cdPlayer = new CDPlayer("teste cd play");
		DVDPlayer dvdPlayer = new DVDPlayer("teste dvd play");
		Luz luz = new Luz(100);
		Tela tela = new Tela("teste tela");
		Projetor projetor = new Projetor("teste projetor");
		
		HomeTheater hmttr = new HomeTheater(amp, cdPlayer, dvdPlayer, projetor, tela, luz);
		
		hmttr.assistirFilme(new Filme("Minions 2", 120));
		hmttr.pararFilme();
		
		hmttr.ouvirCD(new CD("Mamonas Assassinas", 27));
		hmttr.pararCD();
	}
}