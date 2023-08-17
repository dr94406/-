package Generics;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

public class FruitBox {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();

        fruitBox.add(new Fruit());
        System.out.println(fruitBox);
    }
}

    class Box<T> {
        ArrayList<T> list = new ArrayList<T>();
        void add(T item) {
            list.add(item);
        }
        public String toString() {
            return list.toString();
        }
    }
