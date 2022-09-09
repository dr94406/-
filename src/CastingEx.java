package src;

public class CastingEx {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d; // int로 형변환 하여 값 절삭
        System.out.println("score = " + score);
        System.out.println("d = " + d);
    }
}
