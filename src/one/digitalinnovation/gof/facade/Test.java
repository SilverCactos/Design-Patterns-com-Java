package one.digitalinnovation.gof.facade;

/**
 * Teste do padrão Facade.
 * Demonstra a migração simplificada de clientes.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("=== Padrão Facade ===");
        System.out.println();

        Facade facade = new Facade();

        System.out.println("Migrando cliente João:");
        facade.migrarCliente("João", "01001-000");
        System.out.println();

        System.out.println("Migrando cliente Maria:");
        facade.migrarCliente("Maria", "87050-100");
    }
}
