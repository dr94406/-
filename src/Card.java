package src;

class Card6 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card6(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }
Card6() {
        this("HEART", 1);
}


    public String toString() {
        return KIND + " " + NUMBER;
    }
}
class FinalCardTest {
    public static void main(String[] args) {
        Card6 c = new Card6("HEART", 10);
       // c.number = 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);        // System.out.println(c.toString());

    }
}