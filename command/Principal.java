/*Autor: Leonardo Marques Ferreira(Matrícula: 11921BSI235)*/
import comando.*;
import comando.receivers.ArCondicionado;
import comando.receivers.Forno;
import comando.receivers.PanelaEletrica;
import comando.receivers.Som;

public class Principal {
    public static void main(String[] args){
        Controle controle = new Controle(2);

        Forno fornin = new Forno();
        ComandoLigaForno ligaFornin = new ComandoLigaForno(fornin);
        ComandoDesligaForno desligaFornin = new ComandoDesligaForno(fornin);
        ComandoSetarTempForno tempDoFornin = new ComandoSetarTempForno(fornin, 200);
        ComandoSetarTimerForno timerDoFornin = new ComandoSetarTimerForno(fornin, 30);

        PanelaEletrica panelinha = new PanelaEletrica();
        ComandoPanela ligaPanela = new ComandoPanela(panelinha);

        controle.setComando(1, ligaPanela, ligaPanela);
        controle.setComando(2, ligaFornin, desligaFornin);
        
        controle.pressionarOn(2);
        controle.pressionarOff(2);

        // MACRO

        ArCondicionado arzin = new ArCondicionado();
        ComandoLigaAr ligaAr = new ComandoLigaAr(arzin);
        ComandoSetarTempAr tempDoAr = new ComandoSetarTempAr(arzin, 22);

        Som sonzin = new Som();
        ComandoLigaSom ligaSom = new ComandoLigaSom(sonzin);
        ComandoSetarVolumeSom volSom = new ComandoSetarVolumeSom(sonzin, 20);

        Macro macro = new Macro(8);
        macro.setComandosDaMacro(1, ligaAr);
        macro.setComandosDaMacro(2, tempDoAr);
        macro.setComandosDaMacro(3, ligaFornin);
        macro.setComandosDaMacro(4, tempDoFornin);
        macro.setComandosDaMacro(5, timerDoFornin);
        macro.setComandosDaMacro(6, ligaPanela);
        macro.setComandosDaMacro(7, ligaSom);
        macro.setComandosDaMacro(8, volSom);

        macro.executar();
    }
}
