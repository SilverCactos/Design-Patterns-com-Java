package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Representa um ticket de suporte ao cliente.
 * Contém informações sobre o problema e seu nível de prioridade.
 */
public class TicketSuporte {

    private final String id;
    private final String cliente;
    private final String descricao;
    private final NivelPrioridade prioridade;
    private boolean resolvido;
    private String resolvidoPor;

    public TicketSuporte(String id, String cliente, String descricao, NivelPrioridade prioridade) {
        this.id = id;
        this.cliente = cliente;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.resolvido = false;
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public NivelPrioridade getPrioridade() {
        return prioridade;
    }

    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }

    public String getResolvidoPor() {
        return resolvidoPor;
    }

    public void setResolvidoPor(String resolvidoPor) {
        this.resolvidoPor = resolvidoPor;
    }

    @Override
    public String toString() {
        return String.format("Ticket[%s] Cliente: %s | Prioridade: %s | Problema: %s",
                id, cliente, prioridade.getDescricao(), descricao);
    }
}
