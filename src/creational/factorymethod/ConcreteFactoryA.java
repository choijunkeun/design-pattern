package creational.factorymethod;

public class ConcreteFactoryA implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
