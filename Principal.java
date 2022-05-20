// clase de testes

import banco.*;

public class Principal {
    public static void main(String[] argv){
        Conta a = new ContaCorrente(12, "João", "abc", 12345); 
        a.limitar();
        /* tbd
        a.mensal();
        a.rentabilizar(); 
        a.movimentar(); 
        */
        a.setLimite(new Ch_Liberado()); 
        
         
        
    }
}