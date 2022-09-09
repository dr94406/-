package src;

import java.util.Scanner;

public class ScanfEx1 {
    public static void main(String[] args) {
        // 2. Scanner클래스의 객체 생성
        Scanner scanner = new Scanner(System.in);

       /* int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num);
        System.out.println(num2);*/

        String input = scanner.nextLine(); // 라인단위로 입력 받기
        int num = Integer.parseInt(input);
        System.out.println(num);
    }
}
