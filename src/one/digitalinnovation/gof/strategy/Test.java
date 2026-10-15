package one.digitalinnovation.gof.strategy;

/**
 * Teste do padrão Strategy.
 * Demonstra a troca dinâmica de comportamento do Robô.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("=== Padrão Strategy ===");
        System.out.println();

        Robo robo = new Robo();

        System.out.println("Robô em modo NORMAL:");
        robo.setComportamento(new ComportamentoNormal());
        robo.mover();

        System.out.println("Robô em modo DEFENSIVO:");
        robo.setComportamento(new ComportamentoDefensivo());
        robo.mover();

        System.out.println("Robô em modo AGRESSIVO:");
        robo.setComportamento(new ComportamentoAgressivo());
        robo.mover();
    }
}
