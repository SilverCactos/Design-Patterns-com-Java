package one.digitalinnovation.gof.chainofresponsibility;

/**
 * Teste do padrão Chain of Responsibility.
 * 
 * Cenário: Sistema de Suporte ao Cliente.
 * Tickets de diferentes prioridades passam pela cadeia:
 *   Atendente -> Supervisor -> Gerente -> Diretor
 * 
 * Cada handler tenta resolver; se não consegue, encaminha ao próximo.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("=== Padrão Chain of Responsibility ===");
        System.out.println("=== Sistema de Suporte ao Cliente ===");
        System.out.println();

        // Montando a cadeia: Atendente -> Supervisor -> Gerente -> Diretor
        Handler atendente = new AtendenteHandler();
        Handler supervisor = new SupervisorHandler();
        Handler gerente = new GerenteHandler();
        Handler diretor = new DiretorHandler();

        atendente.setProximo(supervisor)
                 .setProximo(gerente)
                 .setProximo(diretor);

        // Criando tickets de suporte com diferentes prioridades
        TicketSuporte[] tickets = {
            new TicketSuporte("T001", "Carlos", "Esqueci minha senha", NivelPrioridade.BASICO),
            new TicketSuporte("T002", "Ana", "Quero reembolso da compra #4521", NivelPrioridade.INTERMEDIARIO),
            new TicketSuporte("T003", "Roberto", "Processo judicial - cobrança indevida", NivelPrioridade.CRITICO),
            new TicketSuporte("T004", "Fernanda", "Vazamento de dados pessoais - LGPD", NivelPrioridade.URGENTE),
            new TicketSuporte("T005", "João", "Como atualizar meu cadastro?", NivelPrioridade.BASICO),
        };

        // Processando cada ticket pela cadeia
        for (TicketSuporte ticket : tickets) {
            System.out.println("─────────────────────────────────────────");
            System.out.println("Novo ticket recebido: " + ticket);
            atendente.processar(ticket);
            System.out.printf("  Resultado: %s (resolvido por: %s)%n%n",
                    ticket.isResolvido() ? "RESOLVIDO ✔" : "NÃO RESOLVIDO ✘",
                    ticket.getResolvidoPor());
        }

        // Resumo final
        System.out.println("════════════════════════════════════════=");
        System.out.println("RESUMO DOS TICKETS:");
        System.out.println("════════════════════════════════════════=");
        for (TicketSuporte ticket : tickets) {
            System.out.printf("  %s | %s | Resolvido por: %s%n",
                    ticket.getId(),
                    ticket.isResolvido() ? "✔ RESOLVIDO" : "✘ PENDENTE",
                    ticket.getResolvidoPor());
        }
    }
}
