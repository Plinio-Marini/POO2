
public class ContaSalario extends Conta {

	public ContaSalario() {
	    /*setLimite(new Ch_Bloqueado());
	    setMensalidade(new M_Normal()); 
	    setMovimentacao(new M_Simplificada()); 
	    setRentabilidade(new R_Baixa());
	    */
	    Limite l = new Ch_Bloqueado(); 
	    setLimite(l); 
	    Mensalidade m = new M_Normal(); 
	    Movimentacao mo = new M_Simplificada(); 
	    Rentabilidade r = new R_Baixa(); 
	    this.setSenha("cba");
	    this.setCliente("Matheus");
	    this.setSaldo(15460);
	    this.setNumero(11);
        
	}

}
