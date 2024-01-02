package creational.factorymethod;

public class ConcreteFactoryA implements AbstractFactory {

    // Thread-Safe 한 싱글톤 객체화
    private ConcreteFactoryA() {}
    private static class SingleInstanceHolder {
        private static final ConcreteFactoryA INSTANCE = new ConcreteFactoryA();
    }
    public static ConcreteFactoryA getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
