package src;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine car2 = null;
        FireEngine fe = null;

        car.drive();
//        fe = (FireEngine) car7;
        fe.drive();
        car2 = fe;
        car2.drive();

    }
}
