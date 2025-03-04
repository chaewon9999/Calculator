package level3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class ArithmeticCalculator<T extends Double> {
    private List<T> numList = new ArrayList<>();

     private T num1;
     private T num2;
     private Double result;

     char add = OperatorType.ADD.getOperator();
     char sub = OperatorType.SUB.getOperator();
     char mul = OperatorType.MUL.getOperator();
     char div = OperatorType.DIV.getOperator();

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    /** 연산 로직 **/
    public void calculate(char operation) {
        if (operation == add) {
            result = num1.doubleValue() + num2.doubleValue();
        } else if (operation == sub) {
            result = num1.doubleValue() - num2.doubleValue();
        } else if (operation == mul) {
            result = num1.doubleValue() * num2.doubleValue();
        } else if (operation == div) {
            //num2의 값이 0일 경우 예외처리
            try {
                if (num2.doubleValue() == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = num1.doubleValue() / num2.doubleValue();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                result = 0.0;
                return;
            }
        }
        numList.add((T)result);
    }

    public T getResult() {
        System.out.print("연산 결과: ");
        return (T) result;
    }

    /**연산 결과보다 큰 수들 리스트에서 반환**/
    public void getLargeResult() {
        System.out.println("지금까지의 연산 중 현재 연산 결과보다 큰 수: ");
        numList.stream()
                .filter(num -> num.doubleValue() > result)
                .forEach(System.out::println);
    }

    /**계산을 계속 수행할지 확인하는 로직**/
    public boolean shouldContinue(String answer) {
        if (answer.equals("exit")) {
            System.out.println("계산기를 종료합니다.");
            return false;
        }
        return true;
    }
}
