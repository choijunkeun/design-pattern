package creational.singleton;

/* 문제점
    - 원자성 결여
    - 자바는 멀티쓰레드 환경을 제공한다. 싱글 스레드 환경에서 사용할 때는 문제가 되지 않지만,
        멀티스레드 환경에서는 동시성 문제가 발생할 수 있음.
    - 여러 개의 쓰레드가 동시에 getInstance() 메소드에 접근한다고 할 때 여러 개의 인스턴스가 만들어질 수도 있음.
 */
public class Singleton_1 {
    private static Singleton_1 instance;

    private Singleton_1() {}

    public static Singleton_1 getInstance() {
        if(instance == null) {
            instance = new Singleton_1();
        }
        return instance;
    }

    public static void main(String[] args) {
    }
}
