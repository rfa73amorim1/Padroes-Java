package one.digitallinnovation.gof.strategy;

//O Robô representa o "contexto no modelo do Strategy
public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
