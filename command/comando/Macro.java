package comando;

public class Macro implements Comando{
    private Comando[] listaDeComandos;
    private int numeroDeComandos;

    public Macro(int numeroDeComandos){
        this.numeroDeComandos = numeroDeComandos;
        listaDeComandos = new Comando[numeroDeComandos];
    }

    public void executar(){
        for(int i = 0; i < numeroDeComandos; i++){
            listaDeComandos[i].executar();
        }
    }

    public void setComandosDaMacro(int posicao, Comando comando){
        listaDeComandos[posicao - 1] = comando;
    }
}
