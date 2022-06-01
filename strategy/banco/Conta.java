package banco;

public abstract class Conta {
    private Limite limite; 
    private Mensalidade mensalidade; 
    private Rentabilidade rentabilidade; 
    private Movimentacao movimentacao; 
    private int numero; 
    private String senha; 
    private String cliente; 
    private float saldo;
    
    // construtor

    public Conta(Limite limite, Mensalidade mensalidade, Rentabilidade rentabilidade, Movimentacao movimentacao, int numero, String cliente, String senha, float saldo){
        this.limite = limite;
        this.mensalidade = mensalidade;
        this.rentabilidade = rentabilidade;
        this.movimentacao = movimentacao;
        this.numero = numero;
        this.cliente = cliente;
        this.senha = senha;
        this.saldo = saldo;
    }

    // construtor


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
	    this.limite = l; 
	}

   public void setMovimentacao(Movimentacao mo){
	    this.movimentacao = mo; 
	}
	
   public void setRentabilidade(Rentabilidade r){
	    this.rentabilidade = r; 
	}
	
   public void setMensalidade(Mensalidade m){
	    this.mensalidade = m; 
	}

    // metodos limitar/mensal/rentabilizar/movimentar?

   public void limitar(){
       this.limite.limitar();
   }
   
   public void movimentar(){
       this.movimentacao.movimentar(); 
   }
   
   public void mensal(){
       this.mensalidade.mensal(); 
   }
   
   public void rentabilizar(){
       this.rentabilidade.rentabilizar(); 
   }

   // getters para mensalidade/rentabilidade/movimentacao?
   // removido

}
