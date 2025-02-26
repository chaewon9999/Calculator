package level2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true) {
            /**첫 번째 숫자 입력**/
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("잘못된 숫자입니다.");
                continue;
            }

            /**두 번째 숫자 입력**/
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("잘못된 숫자입니다.");
                continue;
            }

            sc.nextLine(); //줄바꿈

            /**연산기호 입력**/
            System.out.print("사칙 연산 기호를 입력하세요(+, -, *, /) : ");
            char operator = sc.next().charAt(0);

            /**연산 검증**/
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/' && num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("잘못된 계산입니다");
                continue;
            }

            /**연산 결과 반환**/
            System.out.println("계산 결과: " + result);
            sc.nextLine();

            /**exit를 입력 받으면 종료**/
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String choice = sc.nextLine();
            if (choice.toLowerCase().equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                return;
            }
        }
    }
}
