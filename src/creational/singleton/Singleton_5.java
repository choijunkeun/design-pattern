package creational.singleton;

/*
* 정적멤버와 Lazy Holder(중첩 클래스) 사용
* SingleInstanceHolder라는 내부클래스를 하나 더 만들어서, Singleton_5 클래스가 최초에 로딩되더라도
* 함께 초기화가 되지 않고 getInstance()가 호출 될 때 SingleInstanceHolder클래스가 로딩되어 인스턴스를 생성한다.
* */
public class Singleton_5 {
    private static class SingleInstanceHolder {
        private static final Singleton_5 INSTANCE = new Singleton_5();
    }
    public static Singleton_5 getInstance() {
        return SingleInstanceHolder.INSTANCE;

    }

    public static void main(String[] args) {
        System.out.println(Singleton_5.getInstance());
        System.out.println(Singleton_5.getInstance());
    }
}
