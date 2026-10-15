package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Handler concreto — Diretor (Nível 4).
 * Última instância da cadeia. Resolve qualquer problema restante.
 */
public class DiretorHandler extends Handler {

    public DiretorHandler() {
        super("Diretor", NivelPrioridade.URGENTE.getNivel());
    }

    @Override
    protected void resolver(TicketSuporte ticket) {
        System.out.printf("  [%s] ✔ Resolvendo ticket %s: \"%s\"%n", nome, ticket.getId(), ticket.getDescricao());
        System.out.printf("  [%s]   Ação: Intervenção direta da diretoria para o caso de %s.%n",
                nome, ticket.getCliente());
        System.out.printf("  [%s]   Este é o nível máximo de escalação.%n", nome);
        ticket.setResolvido(true);
        ticket.setResolvidoPor(nome);
    }
}
