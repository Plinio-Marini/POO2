
public class ContaSalario extends Conta {

    public ContaSalario() {
        Limite l = new Ch_Bloqueado(); 
        Mensalidade m = new M_Normal(); 
        Movimentacao mo = new M_Simplificada(); 
        Rentabilidade r = new R_Baixa(); 
        this.setSenha("cba");
        this.setCliente("Matheus");
        this.setSaldo(15460);
        this.setNumero(11);
        
    }

}
