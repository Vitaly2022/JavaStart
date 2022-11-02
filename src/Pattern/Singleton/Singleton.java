package Pattern.Singleton;

public class Singleton {
    private static volatile Singleton instanse;

    private Singleton() {
        System.out.println("I am First Singltone");
    }

    public static Singleton getInstanse() {
        if (instanse == null) {
            synchronized (Singleton.class) {
                if (instanse == null) instanse = new Singleton();
            }
        }
        return instanse;

    }
}
