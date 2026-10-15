package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Handler concreto — Supervisor (Nível 2).
 * Resolve problemas intermediários: reembolsos, reclamações formais.
 */
public class SupervisorHandler extends Handler {

    public SupervisorHandler() {
        super("Supervisor", NivelPrioridade.INTERMEDIARIO.getNivel());
    }

    @Override
    protected void resolver(TicketSuporte ticket) {
        System.out.printf("  [%s] ✔ Resolvendo ticket %s: \"%s\"%n", nome, ticket.getId(), ticket.getDescricao());
        System.out.printf("  [%s]   Ação: Analisando caso e aplicando política de compensação para %s.%n",
                nome, ticket.getCliente());
        ticket.setResolvido(true);
        ticket.setResolvidoPor(nome);
    }
}
