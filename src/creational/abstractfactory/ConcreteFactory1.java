package creational.abstractfactory;

import creational.factorymethod.ConcreteProductB;

// Product A1, Product B1 제품을 생성하는 공장 1
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
