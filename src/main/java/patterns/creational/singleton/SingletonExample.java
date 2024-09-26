package patterns.creational.singleton;

public class SingletonExample {
    private static SingletonExample instance;

    public static SingletonExample getInstance() {
        if (instance == null) {
            System.out.println("Singleton created");
            instance = new SingletonExample();
            return instance;
        }
        System.out.println("Singleton already created");
        return instance;
    }
}
