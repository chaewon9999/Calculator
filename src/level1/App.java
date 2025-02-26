package level1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        while (true) {
            /**첫 번째 숫자 입력**/
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = scanner.nextInt();
            if (firstNum < 0) {
                System.out.println("잘못된 숫자입니다.");
                continue;
            }

            /**두 번째 숫자 입력**/
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = scanner.nextInt();
            if (secondNum < 0) {
                System.out.println("잘못된 숫자입니다.");
                continue;
            }

            scanner.nextLine(); //줄바꿈

            /**연산기호 입력**/
            System.out.print("사칙 연산 기호를 입력하세요(+, -, *, /) : ");
            char operator = scanner.next().charAt(0);

            /**연산 검증**/
            if (operator == '+') {
                result = firstNum + secondNum;
            } else if (operator == '-') {
                result = firstNum - secondNum;
            } else if (operator == '*') {
                result = firstNum * secondNum;
            } else if (operator == '/' && secondNum != 0) {
                result = firstNum / secondNum;
            } else {
                System.out.println("잘못된 계산입니다");
                continue;
            }

            /**연산 결과 반환**/
            System.out.println("계산 결과: " + result);
            scanner.nextLine();

            /**exit를 입력 받으면 종료**/
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String choice = scanner.nextLine();
            if (choice.toLowerCase().equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                return;
            }
        }
    }
}
