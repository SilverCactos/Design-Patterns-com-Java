package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Eager" — A instância é criada no momento em que a classe é carregada.
 * 
 * @author digitalinnovationone
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
