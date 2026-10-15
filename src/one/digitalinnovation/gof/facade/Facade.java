package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.subsistema1.CrmService;
import one.digitalinnovation.gof.facade.subsistema2.CepApi;

/**
 * Facade — Simplifica a interação com os subsistemas CRM e CEP.
 */
public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CrmService.gravarCliente(nome);
        String cepCompleto = CepApi.recuperarCidade(cep);
        System.out.println("  => Cliente migrado: " + cidade + " - CEP: " + cepCompleto);
    }
}
