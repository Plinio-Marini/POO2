public class ContaPoupanca extends Conta
{
    public ContaPoupanca()
    {
        Limite l = new Ch_Bloqueado(); 
        Mensalidade m = new M_Baixa(); 
        Movimentacao mo = new M_Simplificada(); 
        Rentabilidade r = new R_Normal(); 
        this.setSenha("bca");
        this.setCliente("Lucas");
        this.setSaldo(1245);
        this.setNumero(10);
        
    }
}
