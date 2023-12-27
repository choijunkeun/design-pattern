package creational.singleton;

/* 문제점
    - synchronized를 사용하여 1번의 문제를 개선하였다.
    - 최초로 접근한 스레드가 메서드 호출시에 다른 스레드가 접근하지 못하도록 lock을 걸어줌.
      하지만 getInstance() 메서드를 호출 할 떄 마다 lock이 걸려 성능이 저하됨.
 */
public class Singleton_2 {
    private static Singleton_2 instance;

    private Singleton_2() {}

    /** 메서드에 synchronized 키워드 사용*/
    public static synchronized Singleton_2 getInstance() {
        if(instance == null) {
            instance = new Singleton_2();
        }
        return instance;
    }

    public static void main(String[] args) {
    }
}
