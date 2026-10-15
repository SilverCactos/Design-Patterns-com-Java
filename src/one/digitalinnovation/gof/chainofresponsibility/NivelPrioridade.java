package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Enum que define os níveis de prioridade dos tickets de suporte.
 * Cada nível corresponde a um handler diferente na cadeia.
 */
public enum NivelPrioridade {

    BASICO(1, "Básico"),
    INTERMEDIARIO(2, "Intermediário"),
    CRITICO(3, "Crítico"),
    URGENTE(4, "Urgente");

    private final int nivel;
    private final String descricao;

    NivelPrioridade(int nivel, String descricao) {
        this.nivel = nivel;
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }
}
