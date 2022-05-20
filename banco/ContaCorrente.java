package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, String cliente, String senha, float saldo) {
	    /*setLimite(new Ch_Bloqueado());
            setMensalidade(new M_Baixa()); 
            setMovimentacao(new M_Simplificada()); 
            setRentabilidade(new R_Normal()); */

        // 12, "João", "abc", 12345

        super(new Ch_Bloqueado(), new M_Baixa(), new R_Normal(), new M_Simplificada(), numero, cliente, senha, saldo);
	}
}