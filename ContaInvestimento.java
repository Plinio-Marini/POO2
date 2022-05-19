public class ContaInvestimento extends Conta
{
    public ContaInvestimento()
    {
        /*setLimite(new Ch_Liberado());
        setMensalidade(new M_Baixa()); 
        setMovimentacao(new M_Completa()); 
        setRentabilidade(new R_Normal());*/
        Limite l = new Ch_Liberado(); 
        Mensalidade m = new M_Baixa(); 
        Movimentacao mo = new M_Completa(); 
        Rentabilidade r = new R_Normal(); 
        this.setSenha("acb");
	this.setCliente("Rafael");
	this.setSaldo(167);
	this.setNumero(9);
        
    }
}
