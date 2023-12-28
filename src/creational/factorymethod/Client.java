package creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        // 1. 공장 객체 생성
        AbstractFactory[] factory = {
                new ConcreteFactoryA(),
                new ConcreteFactoryB()
        };

        Product productA = factory[0].createOperation(); // 제품 A 생성
        Product productB = factory[1].createOperation(); // 제품 B 생성
    }
}
