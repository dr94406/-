package src;

class Data2 {
    int value;
}
class Data3{
    int value;

    Data3(int x) { // 매개변수 있는 생성자.
        value = x;
    }
}
class ConstructorTest {
    public static void main(String[] args) {
           Data2 d2 = new Data2();
        // Data3 d3 = new Data3(); // compile error 발생
    }
}
