final class Card1 {
    String kind;
    int num;

    Card1() {
        this("SPADE", 1);
    }

    Card1(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString(){
        return kind + ":" + num;
    }
}
class ClassEx1 {
    public static void main(String[] args) throws Exception{
        Card c = new Card("HEART", 3);
        Card c2 = Card.class.newInstance(); // 객체생성

        Class cObj = c.getClass();
        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}

