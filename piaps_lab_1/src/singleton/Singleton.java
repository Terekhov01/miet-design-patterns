package singleton;

public class Singleton {
    private static volatile Singleton instance;
    private int id;

    private Singleton(int id) {
        this.id = id;
    }

    public static Singleton getInstance(int value){
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "id=" + id +
                '}';
    }
}
