package one.digitalinnovation.gof.facade.subsistema1;

public class CrmService {

    public static String gravarCliente(String nome) {
        System.out.println("  [CRM] Cliente '" + nome + "' gravado no sistema.");
        return nome;
    }
}
