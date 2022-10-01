package src;

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) squareroot");
            System.out.println("(3) log");
            System.out.println("(4) 원하는메뉴 누르셈 종료 0");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);
            
            if(menu==0) {
                System.out.println("시스템종료");
                break;
            }else if(!(1 <= menu && menu <=3)) {
                System.out.println("메뉴선택잘못함 종료는 0");
                continue;
            }

            System.out.println("선택한 메뉴"+menu+"번임");
        }
    }
}
