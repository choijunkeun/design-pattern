package creational.singleton;
/*
* 정적(static) 멤버 사용
* static 멤버나 블록은 런타임이 아니라 최초에 JVM이 클래스 로딩 때 모든 클리스들을 로드할 때 미리 인스턴스를 생성해줌.
* 따라서 클래스 로딩과 동시에 싱글턴 인스턴스가 생성되고 모듈들이 싱글턴 인스턴스를 요청할 때 그냥 만들어진 인스턴스를 반환함.
*
* 문제점 - 불필요한 자원낭비. 어떤로직에서는 싱글톤 인스턴스가 필요없는 경우도 있는데
*           이 방법은 무조건 싱글톤 클래스를 호출해 인스턴스를 만들기 때문.
* */
public class Singleton_3 {

    private final static Singleton_3 instance = new Singleton_3();

    private Singleton_3(){}

    public static Singleton_3 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton_3.instance);
    }
}
