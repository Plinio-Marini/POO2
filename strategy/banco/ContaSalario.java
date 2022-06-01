package banco;

public class ContaSalario extends Conta {

	public ContaSalario(int numero, String cliente, String senha, float saldo) {
	    /*setLimite(new Ch_Bloqueado());
	    setMensalidade(new M_Normal()); 
	    setMovimentacao(new M_Simplificada()); 
	    setRentabilidade(new R_Baixa()); */

		// 11, "Matheus", "cba", 15460

        super(new Ch_Bloqueado(), new M_Normal(), new R_Baixa(), new M_Simplificada(), numero, cliente, senha, saldo);
	}
}
