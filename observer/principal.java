/*Autores: Leonardo Marques (Matrícula: 11921BSI235) e Plínio Marini (Matrícula: 11921BSI236)*/
import observer.*;

public class principal {
    public static void main(String[] argv){
        String acoesTeste = "Petrobras: 20.54\nVale: 30.01\nOCX: 47.59\nFBOK34: 31,46\nTWTR34 96,95";
        Servidor servidor = new Servidor();

        HomeBroker cliente1 = new HomeBroker(servidor);
        HomeBroker cliente2 = new HomeBroker(servidor);
        HomeBroker cliente3 = new HomeBroker(servidor);

        servidor.setValor(acoesTeste);
    }
}
