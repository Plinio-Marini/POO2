public class ContaUniversitario extends Conta
{
    public ContaUniversitario()
    {
        Limite l = new Ch_Bloqueado(); 
        Mensalidade m = new M_Baixa(); 
        Movimentacao mo = new M_Simplificada(); 
        Rentabilidade r = new R_Baixa(); 
        this.setSenha("aaa");
        this.setCliente("Sergio");
        this.setSaldo(0);
        this.setNumero(90);
        
    }
}
