package observer;

public class HomeBroker implements Cliente{
    private String valor;
    private Acao acao;

    public HomeBroker(Acao acao){
        this.acao = acao;
        this.acao.registrarCliente(this);
    }

    public void atualizar(String valor){
        this.valor = valor;
        exibir();
    }

    public void exibir(){
        System.out.println("\n===========Ações===========");
        System.out.println(valor);
    }
    
}
