package Practice;

public class BindingTest {
    public static void main(String[] args) {
    hot h = new progen();
    progen p = new progen();
        System.out.println(h.h);
        h.method();
        System.out.println(p.p);
        p.method();

    }
}

class hot{
    int h = 100;
    void method(){
        System.out.println("hottest");
    }
}
class progen extends hot{
 int p = 200;
 void method(){
     System.out.println("progentest");
 }
}
