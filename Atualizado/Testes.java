/*Autores: Leonardo Marques (Matrícula: 11921BSI235) e Plínio Marini (Matrícula: 11921BSI236)*/
public class Testes {
    public static void main(){
        ContaCorrente a = new ContaCorrente(); 
        a.limitar();
        a.mensal();
        a.rentabilizar(); 
        a.movimentar(); 
        
        a.setLimite(new Ch_Liberado()); 
        a.limitar();
        
        ContaPoupanca p = new ContaPoupanca(); 
        p.limitar(); 
        p.mensal(); 
        p.rentabilizar(); 
        p.movimentar(); 
        
        p.setMensalidade(new M_Normal()); 
        p.mensal(); 
        
        ContaUniversitario u = new ContaUniversitario();
        u.limitar();
        u.mensal();
        u.rentabilizar(); 
        u.movimentar(); 
        
        u.setRentabilidade(new R_Normal()); 
        u.rentabilizar(); 
            
         
        
    }
}
