package template.banco;

public class CorrentePessoaFisica extends Conta{
    private String cpf;
    private float limite;

    public CorrentePessoaFisica(String senha, String cpf, float valorInicial, float limite){
        super.cadastrarSenha(senha);
        super.depositarValorInicial(valorInicial);
        this.cadastrarPessoaFisica(cpf);
        this.configurarLimite(limite);
    }

    public void cadastrarPessoaFisica(String cpf){
        this.cpf = cpf;
    }

    public void validarPessoaFisicaSPC(){
        if(cpf != null){
            System.out.println("Validando...");
        }else{
            System.out.println("Invalido.");
        }
    }

    public void configurarLimite(float limite){
        this.limite = limite;
    }

    public void pedirCartao(){
        System.out.println("cartao solicitado!");
    }
}
