package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;

        // 1. 공장 1 가동
        factory = new ConcreteFactory1();

        // 2. 공장 1을 통해 제품 A1, 제품 B1을 생성한다.(클라이언트는 구체적인 구현은 모르고 인터페이스에 의존)
        AbstractProductA productA1 = factory.createProductA();
        AbstractProductB productB1 = factory.createProductB();
        System.out.println(productA1.getClass().getName()); // creational.abstractfactory.ConcreteProductA1
        System.out.println(productB1.getClass().getName()); // creational.abstractfactory.ConcreteProductB1

        // 3. 공장 2 가동
        factory = new ConcreteFactory2();

        // 4. 공장 2를 통해 제품 A2, 제품 B2를 생성한다.
        AbstractProductA productA2 = factory.createProductA();  // creational.abstractfactory.ConcreteProductA2
        AbstractProductB productB2 = factory.createProductB();  // creational.abstractfactory.ConcreteProductB2
        System.out.println(productA2.getClass().getName());
        System.out.println(productB2.getClass().getName());

        /*
        * 사용자는 단지 createProductA() 또는 createProductB()를 호출할 뿐이지만,
        * 어떤 팩토리(공장) 객체이냐에 따라 1제품군 또는 2제품군을 생성한다.
        *
        * - 사용시기
        *   > 관련 제품의 다양한 제품 군과 함께 작동해야 할 때, 해당 제품의 구체적인 클래스에 의존하고 싶지 않은 경우
        *   > 여러 제품군 중 하나를 선택해서 시스템을 설정해야하고 한 번 구성한 제품을 다른 것으로 대체할 수도 있을 때
        *   > 제품에 대한 클래스 라이브러리를 제공하고, 그들의 구현이 아닌 인터페이스를 노출 시키고 싶을 때
        *
        * - 장점
        *   > 객체를 생성하는 코드를 분리 - 클라이언트 코드와 결합도를 낮출 수 있다.
        *   > 제품 군을 쉽게 대체 가능
        *   > 단일 책임 원칙을 준수한다.
        *   > 개방 / 폐쇄 원칙을 준수한다.
        * */



    }
}
