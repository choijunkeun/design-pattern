package creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        // 1. 공장 객체 생성
        Product product1 = ConcreteFactoryA.getInstance().createOperation("제품명1");
        Product product1_2 = ConcreteFactoryA.getInstance().createOperation("제품명1");
        Product product2 = ConcreteFactoryB.getInstance().createOperation("제품명2");
        Product product2_2 = ConcreteFactoryB.getInstance().createOperation("제품명2");

        ConcreteFactoryA facA = ConcreteFactoryA.getInstance();
        ConcreteFactoryA facA_2 = ConcreteFactoryA.getInstance();
        ConcreteFactoryB facB = ConcreteFactoryB.getInstance();
        ConcreteFactoryB facB_2 = ConcreteFactoryB.getInstance();

        System.out.println("facA == facA_2" + facA.equals(facA_2));
        System.out.println("facA = " + facA);
        System.out.println("facA_2 = " + facA_2);


        System.out.println("product1 = " + product1);
        System.out.println("product1_2 = " + product1_2);

        System.out.println("product2 = " + product2);
        System.out.println("product2_2 = " + product2_2);


//        Product productA = factory[0].createOperation(); // 제품 A 생성
//        Product productB = factory[1].createOperation(); // 제품 B 생성
    }
}
