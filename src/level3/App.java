package level3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
             calculator.setNum1(sc.nextDouble());

            System.out.print("두 번째 숫자를 입력하세요: ");
            calculator.setNum2(sc.nextDouble());

            sc.nextLine();

            System.out.print("사칙 연산 기호를 입력하세요(+, -, *, /) : ");
            calculator.calculate(sc.next().charAt(0));

            sc.nextLine();

            System.out.println(calculator.getResult()); //결과값 반환
            calculator.getLargeResult(); //결과값보다 큰 수 list에서 반환

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (!calculator.shouldContinue(sc.nextLine())) {
                return;
            }
        }
    }
}
