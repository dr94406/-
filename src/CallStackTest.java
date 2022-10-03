package src;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod(); // static Method는 객체없이 호출이 가능하다.
    }

    static void firstMethod(){
        secondMethod();
    }
    static  void secondMethod() {
        System.out.println("secondMethod()");
    }
}
