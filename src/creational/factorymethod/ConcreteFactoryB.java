package creational.factorymethod;

public class ConcreteFactoryB implements AbstractFactory {

    // Thread-Safe한 싱글톤 객체화
    private ConcreteFactoryB() {}
    private static class SingleInstanceHolder {
        private static final ConcreteFactoryB INSTANCE = new ConcreteFactoryB();
    }
    public static ConcreteFactoryB getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
