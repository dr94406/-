package src;

import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) squareroot");
            System.out.println("(3) log");
            System.out.println("(4) 원하는메뉴 누르셈 종료 0");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0){
                System.out.println("프로그램을 종료");
                break;


            }
        }
    }
}
