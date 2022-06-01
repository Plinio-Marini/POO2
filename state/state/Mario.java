package state;

public class Mario {
    private Estado estado;
    private int pontuacao;

    public Mario(){
        estado = new MarioPequeno(this);
        pontuacao = 0;
    }

    public void setState(Estado estado){
        this.estado = estado;
    }

    public void ganharPontos(int pontuacao){
        this.pontuacao += pontuacao;
    }

    public void pegarCogumelo(){
        estado.pegarCogumelo();
    }

    public void pegarFlor(){
        estado.pegarFlor();
    }

    public void pegarPena(){
        estado.pegarPena();
    }

    public void levarDmg(){
        estado.levarDmg();
    }
}