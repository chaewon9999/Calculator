package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> resultList = new ArrayList<>();
    private int result;

    /**연산하기**/
    public int calculate(int num1, int num2, char operate) {
        if (operate == '+') {
            result =  num1 + num2;
        } else if (operate == '-') {
            result =  num1 - num2;
        } else if (operate == '*') {
            result =  num1 * num2;
        } else if (operate == '/') {
            result =  num1 / num2;
        }

        return result;
    }

    /**메세지와 함께 resultList의 마지막 값 반환**/
    public void getResult() {
        System.out.println("계산 결과: " + resultList.get(resultList.size() - 1));
    }

    /**resultList에 값 넣어줌**/
    public void setResult(int num) {
        resultList.add(num);
    }

    /**resultList 반환**/
    public List<Integer> getResultList() {
        return resultList;
    }

    /**resultList의 첫 번째 값 삭제**/
    public void removeResult() {
        resultList.remove(0);
    }

    public boolean isPlus(int num) {
        if (num < 0) {
            System.out.println("잘못된 숫자입니다.");
            return false;
        }
        return true;
    }
}
