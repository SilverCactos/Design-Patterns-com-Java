package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Handler abstrato — Define a interface da cadeia de responsabilidade.
 * 
 * Cada handler concreto:
 * 1. Verifica se pode tratar o ticket (baseado no nível de prioridade)
 * 2. Se pode, resolve o ticket
 * 3. Se não pode, passa para o próximo handler na cadeia
 */
public abstract class Handler {

    protected Handler proximo;
    protected final String nome;
    protected final int nivelMaximo;

    public Handler(String nome, int nivelMaximo) {
        this.nome = nome;
        this.nivelMaximo = nivelMaximo;
    }

    /**
     * Define o próximo handler na cadeia.
     * Retorna o próximo handler para permitir encadeamento fluente.
     */
    public Handler setProximo(Handler proximo) {
        this.proximo = proximo;
        return proximo;
    }

    /**
     * Processa o ticket: resolve se estiver dentro do nível, ou passa adiante.
     */
    public void processar(TicketSuporte ticket) {
        if (ticket.getPrioridade().getNivel() <= nivelMaximo) {
            resolver(ticket);
        } else if (proximo != null) {
            System.out.printf("  [%s] Não consigo resolver. Encaminhando para %s...%n", nome, proximo.nome);
            proximo.processar(ticket);
        } else {
            System.out.printf("  [%s] ALERTA: Ticket %s não pôde ser resolvido por nenhum handler!%n",
                    nome, ticket.getId());
        }
    }

    /**
     * Método abstrato que cada handler concreto implementa com sua lógica de resolução.
     */
    protected abstract void resolver(TicketSuporte ticket);
}
