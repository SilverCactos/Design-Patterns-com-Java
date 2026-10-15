package one.digitalinnovation.gof.strategy;

/**
 * Contexto que utiliza o padrão Strategy para variar seu comportamento.
 */
public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
