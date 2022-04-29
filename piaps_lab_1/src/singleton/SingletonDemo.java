package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance(0);
//        Singleton singleton2 = Singleton.getInstance(1);
//
//        System.out.println("first: " + singleton);
//        System.out.println("second: " + singleton2);
        Thread thread0 = new Thread(new Thread0());
        Thread thread1 = new Thread(new Thread1());
        thread0.start();
        thread1.start();
    }

    static class Thread0 implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(0);
            System.out.println(singleton);
        }
    }

    static class Thread1 implements Runnable{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(1);
            System.out.println(singleton);
        }
    }
}
