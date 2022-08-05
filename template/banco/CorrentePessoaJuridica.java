package template.banco;

public class CorrentePessoaJuridica extends Conta{
    private String cnpj;
    private float limite;

    public CorrentePessoaJuridica(String senha, String cnpj, float valorInicial, float limite){
        super.cadastrarSenha(senha);
        super.depositarValorInicial(valorInicial);
        this.cadastrarPessoaJuridica(cnpj);
        this.configurarLimite(limite);
    }

    public void cadastrarPessoaJuridica(String cnpj){
        this.cnpj = cnpj;
    }

    public void configurarLimite(float limite){
        this.limite = limite;
    }

    public void validarPessoaJuridicaReceitaFederal(){
        if(cnpj != null){
            System.out.println("validando...");
        }else{
            System.out.println("invalido.");
        }
    }

    public void pedirCartao(){
        System.out.println("cartao solicitado!");
    }
}
