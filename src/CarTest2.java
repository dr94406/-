package src;

class Car3 {
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door;

    Car3() {
    this("white","auto",4);
    }
    Car3(String color) {
        this(color,"auto", 4);
    }
    Car3(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3();

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door ="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door ="+c2.door);
    }
}
