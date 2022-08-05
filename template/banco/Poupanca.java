package template.banco;

public class Poupanca extends Conta{
    private String cpf;

    public Poupanca(String senha, String cpf, float valorInicial){
        super.cadastrarSenha(senha);
        super.depositarValorInicial(valorInicial);
        this.cadastrarPessoaFisica(cpf);
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
}
