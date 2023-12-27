package creational.singleton;


/*
* 정적 블록 사용
* */
public class Singleton_4 {

    private static Singleton_4 instance = null;

    static {
        instance = new Singleton_4();
    }

    private Singleton_4(){}

    public static Singleton_4 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton_4 st1 = Singleton_4.getInstance();
        Singleton_4 st2 = Singleton_4.getInstance();
        System.out.println(st1 == st2);
    }
}
