package creational.singleton;


/*
* Enum 인스턴스는 기본적으로 스레드세이프를 보장한다.
* 싱글턴 생성 방법은 5번과, Enum을 추천.
* 5번은 가장 많이 쓰인다고 알려져있고, 7번은 조슈아 블로크(이펙티브자바 저자)가 추천한 방법
* 특히 7번은 복잡한 직렬화 상황이나 리플렉션 공격에서도 제2의 인스턴스가 생기는 일을 막아준다.
* 단, 만들려는 싱글턴이 Enum 이외의 다른 상위 클래스를 상속해야 한다면 이 방법은 사용할 수 없다.
* */
public enum SingletonEnum {
    INSTANCE;
    int id;
    String name;
    public void tempMethod() {

    }
}
