package state;
public abstract class Estado{
    protected Mario mario;

    public Estado(Mario mario){
        this.mario = mario;
    }

    protected abstract void verifyState(Mario mario);

    public void pegarCogumelo();

    public void pegarFlor();

    public void pegarPena();

    public void levarDmg();

    public void ganharPontos(int pontuacao){
        this.mario.ganharPontos(pontuacao);
    }
}