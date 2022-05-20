package banco;

public class ContaInvestimento extends Conta {
    
    public ContaInvestimento(int numero, String cliente, String senha, float saldo) {
        /*setLimite(new Ch_Liberado());
        setMensalidade(new M_Baixa()); 
        setMovimentacao(new M_Completa()); 
        setRentabilidade(new R_Normal());*/

        //  9, "Rafael", "acb", 167

        super(new Ch_Liberado(), new M_Baixa(), new R_Normal(), new M_Completa(), numero, cliente, senha, saldo);
    }
}
