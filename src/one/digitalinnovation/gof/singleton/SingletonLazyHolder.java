package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder" — Thread-safe sem necessidade de sincronização explícita.
 * Usa o mecanismo de carregamento de classes da JVM para garantir thread safety.
 * 
 * @author digitalinnovationone
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
