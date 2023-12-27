package creational.singleton;


/*
* 이중 확인 잠금(DCL, Double Checked Locking)
* 인스턴스 생성 여부를 싱글턴 패턴 잠금 전에 한번, 객체를 생성하기 전에 한번,
* 총 두번 체크하여 인스턴스가 존재하지 않을 떄만 잠금을 건다.
*
*
* volatile란?
* 자바는 스레드가 2개 열리면 변수를 메인 메모리(RAM)으로부터 가져오는 것이 아니라
* 캐시 메모리에서 각각의 캐시메모리 기반으로 가져옴
* 따라서 스레드끼리는 변수 공유가 안되는데, volatile을 주면 메인메모리기반으로 가져옴.
* */
public class Singleton_6 {

    private volatile Singleton_6 instance;

    private Singleton_6() {}

    public Singleton_6 getInstance() {
        if(instance == null) {
            synchronized (Singleton_6.class) {
                if(instance == null) {
                    instance = new Singleton_6();
                }
            }
        }
        return instance;
    }

}
