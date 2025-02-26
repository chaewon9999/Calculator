package level2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            /**첫 번째 숫자 입력**/
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            if (!calculator.isPlus(num1)) {
                continue;
            }

            /**두 번째 숫자 입력**/
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            if (!calculator.isPlus(num2)) {
                continue;
            }

            sc.nextLine();

            /**연산기호 입력**/
            System.out.print("사칙 연산 기호를 입력하세요(+, -, *, /) : ");
            char operator = sc.next().charAt(0);

            /**연산 후 결과 반환**/
            int result = calculator.calculate(num1, num2, operator);
            calculator.setResult(result);
            calculator.getResult();

            sc.nextLine();

            /**리스트의 크기가 5보다 커지면 가장 먼저 저장된 데이터 삭제**/
            if (calculator.getResultList().size() > 5) {
                calculator.removeResult();
            }

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
