package src;

import javax.xml.crypto.Data;


class primitiveParamEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;
        System.out.println("main() : x =  " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x =  " + d.x);
    }
    static void change(int x ) {    //기본형 매개변수
        x = 1000;
        System.out.println("change() : x =  " +x);
    }
}
class Data1 {int x;}

