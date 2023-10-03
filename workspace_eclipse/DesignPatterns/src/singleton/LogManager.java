package singleton;

public class LogManager {
    // Instância a ser compartilhada
    private static LogManager instance;

    // Construtor privado
    private LogManager() {}

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
