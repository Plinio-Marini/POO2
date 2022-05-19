
public class ContaCorrente extends Conta {

	public ContaCorrente() {
	    /*setLimite(new Ch_Bloqueado());
            setMensalidade(new M_Baixa()); 
            setMovimentacao(new M_Simplificada()); 
            setRentabilidade(new R_Normal()); */
            Limite l = new Ch_Bloqueado(); 
            Mensalidade m = new M_Baixa(); 
            Movimentacao mo = new M_Simplificada(); 
            Rentabilidade r = new R_Normal(); 
            
            this.setSenha("abc");
            this.setCliente("João");
            this.setSaldo(12345);
            this.setNumero(12);
        
	}

}