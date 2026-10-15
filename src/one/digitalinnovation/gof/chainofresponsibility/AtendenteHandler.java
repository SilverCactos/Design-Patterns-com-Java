package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Handler concreto — Atendente (Nível 1).
 * Resolve problemas básicos: reset de senha, dúvidas gerais, informações de conta.
 */
public class AtendenteHandler extends Handler {

    public AtendenteHandler() {
        super("Atendente", NivelPrioridade.BASICO.getNivel());
    }

    @Override
    protected void resolver(TicketSuporte ticket) {
        System.out.printf("  [%s] ✔ Resolvendo ticket %s: \"%s\"%n", nome, ticket.getId(), ticket.getDescricao());
        System.out.printf("  [%s]   Ação: Fornecendo orientações básicas ao cliente %s.%n", nome, ticket.getCliente());
        ticket.setResolvido(true);
        ticket.setResolvidoPor(nome);
    }
}
