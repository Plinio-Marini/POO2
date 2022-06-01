package state;

public class MarioPequeno extends Estado {
    public MarioPequeno(Mario mario){
        super(mario);
    }
    
    public void pegarCogumelo(){
        this.mario.setState(new MarioGrande);
    }

    public void pegarFlor(){
        this.mario.setState(new MarioFogo);
    }

    public void pegarPena(){
        this.mario.setState(new MarioCapa);
    }
}

// adicionar o comportamento do metodo verifyState
// adicionar a verificacao de estado nos metodos pegar
