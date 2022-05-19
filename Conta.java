
public abstract class Conta {
    private Limite l; 
    private Mensalidade m; 
    private Rentabilidade r; 
    private Movimentacao mo; 
    private int numero; 
    private String senha; 
    private String cliente; 
    private float saldo;
    
    public int getNumero() {
            return numero;
	}
    public void setNumero(int numero) {
	    this.numero = numero;
	}
    public String getSenha() {
	    return senha;
	}
    public void setSenha(String senha) {
	    this.senha = senha;
	}
    public String getCliente() {
	    return cliente;
	}
    public void setCliente(String cliente) {
	    this.cliente = cliente;
	}
   public float getSaldo() {
	    return saldo;
	}
   public void setSaldo(float saldo) {
	    this.saldo = saldo;
	}
	
   public void setLimite(Limite l){
	    this.l = l; 
	}
   public void setMovimentacao(Movimentacao mo){
	    this.mo = mo; 
	}
	
   public void setRentabilidade(Rentabilidade r){
	    this.r = r; 
	}
	
   public void setMensalidade(Mensalidade m){
	    this.m = m; 
	}

   public void limitar(){
       this.l.limitar();
   }
}
