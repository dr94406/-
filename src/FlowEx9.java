package src;

import java.util.Scanner;

public class FlowEx9 {
    public static void main(String[] args) {
        char grade = ' ';
        System.out.print("당신의 점수를 입력하세요.(1~100)");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        switch (score) {
            case 100: case 99: case 98: case 97: case 96: case 95:
                grade = 'A';
                break;
            case 80: case 79: case 78: case 77: case 76: case 75:
                grade ='B';
                break;
            case 70: case 69: case 68: case 67: case 66: case 65:
                grade ='C';
                break;
            default:
                grade = 'F';
        }
                System.out.println("당신의 학점은" + grade +"입니다.");
    }
}
