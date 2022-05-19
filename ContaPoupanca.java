public class ContaPoupanca extends Conta
{
    public ContaPoupanca()
    {
        /*setLimite(new Ch_Bloqueado());
        setMensalidade(new M_Baixa()); 
        setMovimentacao(new M_Simplificada()); 
        setRentabilidade(new R_Normal());*/
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
