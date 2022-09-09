package src;

public class tempValue {
    public static void main(String[] args) {
int x = 1000;
int y = 2000;
int temp = 0;
temp = x;
x = y;
y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}