package creational.factorymethod;

public class ConcreteFactoryB implements AbstractFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
