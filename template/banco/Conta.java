package template.banco;

public abstract class Conta {
    private float saldo; // limite ?
    private String senha;
    private String cadastro; //cpf - cnpj

    public final void abrirConta(){

    }

    public final void depositarValorInicial(float valor){
        saldo = saldo + valor;
    }

    public final void cadastrarSenha(String senha){
        this.senha = senha;
    }

    // gancho
    public void configurarLimite(){
    }

    // gancho
    public void pedirCartao(){
    }
}
