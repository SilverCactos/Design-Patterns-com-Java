package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy" — A instância é criada apenas quando solicitada pela primeira vez.
 * 
 * @author digitalinnovationone
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
