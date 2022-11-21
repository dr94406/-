package Practice;

class InterFaceHead implements Inter{
    static void CallBrow(Inter t){
        t.interHead();
    }

    @Override
    public void interHead() {
    }
}
interface Inter{
    public abstract void interHead();

}
class InterFaceBody implements Inter{
    public void interHead() {
        System.out.println("body Attack");
    }
}

class InterFaceHard implements Inter {
    public void interHead() {
        System.out.println("Hard Attack");
    }
}
public class BigInterfaceTest {
    public static void main(String[] args) {
        InterFaceHead.CallBrow(new InterFaceBody());
        InterFaceHead.CallBrow(new InterFaceHard());
    }
}
