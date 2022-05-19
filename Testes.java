public class Testes {
    public static void main(){
        ContaCorrente a = new ContaCorrente(); 
        a.limitar();
        a.mensal();
        a.rentabilizar(); 
        a.movimentar(); 
        
        a.setLimite(new Ch_Liberado()); 
        
         
        
    }
}