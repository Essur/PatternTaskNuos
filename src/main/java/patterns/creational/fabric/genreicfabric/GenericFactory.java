package patterns.creational.fabric.genreicfabric;

public class GenericFactory<T> {
    private final Class<T> type;

    public GenericFactory(Class<T> type) {
        this.type = type;
    }

    public T createInstance() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error creating instance of type " + type.getName());
        }
    }
}
