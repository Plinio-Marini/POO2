// clase de testes

import banco.*;

public class Principal {
    public static void main(String[] argv){
        Conta[] contas = new Conta[4];
        contas[0] = new ContaCorrente(12, "João", "abc", 12345);
        contas[1] = new ContaSalario(11, "Matheus", "cba", 15460);
        contas[2] = new ContaPoupanca(10, "Lucas", "bca", 1245);
        contas[3] = new ContaInvestimento(9, "Rafael", "acb", 167);
        
        for(Conta iterateConta : contas){
            iterateConta.limitar();
        }
        
        /* tbd
        Conta a = new ContaCorrente(12, "João", "abc", 12345); 
        a.limitar();
        a.mensal();
        a.rentabilizar(); 
        a.movimentar();
        a.setLimite(new Ch_Liberado()); 
        */
        
        
         
        
    }
}