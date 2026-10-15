package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Handler concreto — Gerente (Nível 3).
 * Resolve problemas críticos: questões jurídicas, cancelamentos VIP.
 */
public class GerenteHandler extends Handler {

    public GerenteHandler() {
        super("Gerente", NivelPrioridade.CRITICO.getNivel());
    }

    @Override
    protected void resolver(TicketSuporte ticket) {
        System.out.printf("  [%s] ✔ Resolvendo ticket %s: \"%s\"%n", nome, ticket.getId(), ticket.getDescricao());
        System.out.printf("  [%s]   Ação: Escalando internamente e tomando decisão executiva para %s.%n",
                nome, ticket.getCliente());
        ticket.setResolvido(true);
        ticket.setResolvidoPor(nome);
    }
}
