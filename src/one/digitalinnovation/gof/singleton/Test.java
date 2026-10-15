package one.digitalinnovation.gof.singleton;

/**
 * Teste dos padrões Singleton.
 * Demonstra que todas as variantes retornam a mesma instância.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("=== Padrão Singleton ===");
        System.out.println();

        // Singleton Lazy
        System.out.println("--- Singleton Lazy ---");
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println("Instância 1: " + lazy1);
        System.out.println("Instância 2: " + lazy2);
        System.out.println("São a mesma instância? " + (lazy1 == lazy2));
        System.out.println();

        // Singleton Eager
        System.out.println("--- Singleton Eager ---");
        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println("Instância 1: " + eager1);
        System.out.println("Instância 2: " + eager2);
        System.out.println("São a mesma instância? " + (eager1 == eager2));
        System.out.println();

        // Singleton Lazy Holder
        System.out.println("--- Singleton Lazy Holder ---");
        SingletonLazyHolder holder1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
        System.out.println("Instância 1: " + holder1);
        System.out.println("Instância 2: " + holder2);
        System.out.println("São a mesma instância? " + (holder1 == holder2));
    }
}
