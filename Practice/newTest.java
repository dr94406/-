//package Practice;
//
//class Q{
//    void clear(I i){
//        i.play();
//    }
//}
//
//interface I{
//    public abstract void play();
//}
//
//class W implements  I{
//    public void play(){
//        System.out.println("W get good coding");
//    }
//}
//
//class E implements  I{
//    public void play(){
//        System.out.println("E get good coding");
//    }
//}
//
//class R extends Q {
//    void clear(){
//        System.out.println("그래도 호출하고 싶을걸?");
//    }
//}
//public class newTest {
//    public static void main(String[] args) {
//        Q q = new Q();
//        R r = new R();
//        q.clear(new W());
//        q.clear(new E());
//        r.clear();
//    }
//}
