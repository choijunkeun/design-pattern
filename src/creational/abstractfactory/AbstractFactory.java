package creational.abstractfactory;


// 공장 인터페이스
public interface AbstractFactory {
    AbstractProductA createProductA();  // A제품을 만드는 메서드
    AbstractProductB createProductB();  // B제품을 만드는 메서드
}
