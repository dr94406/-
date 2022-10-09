package src;

public class CastingTest {
    public static void main(String[] args) {
        Car6 car6 = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car6 = fe;
//        car.water();
        fe2 = (FireEngine) car6; // 자손타입 <-조상타입
        fe2.water();
    }
}

class Car6 {
    String color;
    int door;

    void drive () {
        System.out.println("drive,Brrr");
    }

    void stop() {
        System.out.println("stop!!!!");
    }
}

class FireEngine extends Car6 {
    void water() {
        System.out.println("water!!!!");
    }
}

