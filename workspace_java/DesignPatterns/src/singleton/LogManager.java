package singleton;

/**
 * Singleton desing
 * @author Isaque
 * @version 1.0
 * @since 3/10/23
 */
public class LogManager {
    // Instância a ser compartilhada
    private static LogManager instance;

    // Construtor privado
    private LogManager() {}

    /**
     * Singleton design implementation
     * @return the same instance for every "request"
     */
    public static LogManager getInstance() {
        if(instance == null) {
            instance = new LogManager();
        }

        return instance;
    }

    public void info(String msg) {
        System.out.println("info: " + msg);
    }

    public void error(String msg) {
        System.out.println("error: " + msg);
    }

    public void warn(String msg) {
        System.out.println("error: " + msg);
    }
}
