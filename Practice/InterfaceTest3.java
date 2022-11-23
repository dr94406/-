package Practice;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}
class A {
    void methodA(){
        I i = InstanceManager.getInstance(); // 인스턴스 매니저의 객체를 반환한다.
        i.methodB(); // 그 객체의 메소드 B를 뽑아낸다. methodB in B class
        System.out.println(i.toString()); // toString을 반환하니 class B를 반환함
    }
}
interface I{
    public abstract void methodB();
}
class B implements I {
    public void methodB() {
        System.out.println("methodB in B class");
    }
    public String toString() {return "class B";}
}

class InstanceManager{
    public static I getInstance(){
        return new B(); // 객체의 리턴값은 B
    }
}