package level1;

import java.util.Scanner;

public class CalculatorMain {

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
            System.out.print("원하는 연산 기호를 입력하세요(+, -, *, /) : ");
            String symbol = scanner.nextLine();

            /**연산 검증**/
            if (symbol.equals("+")) {
                result = firstNum + secondNum;
            } else if (symbol.equals("-")) {
                result = firstNum - secondNum;
            } else if (symbol.equals("*")) {
                result = firstNum * secondNum;
            } else if (symbol.equals("/") && secondNum != 0) {
                result = firstNum / secondNum;
            } else {
                System.out.println("잘못된 계산입니다");
                continue;
            }

            /**연산 결과 반환**/
            System.out.println("계산 결과: " + result);

            /**re or exit**/
            while (true) {
                System.out.println("re || exit : ");
                String choice = scanner.nextLine();
                if (choice.toLowerCase().equals("re")) {
                  break;
                } else if (choice.toLowerCase().equals("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    return;
                } else {
                    System.out.println("잘못된 입력입니다");
                }
            }
        }
    }
}
