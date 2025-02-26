package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> resultList = new ArrayList<>();
    private int result;

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

    public void getResult() {
        System.out.println("계산 결과: " + resultList.get(resultList.size() - 1));
    }

    public void setResult(int num) {
        resultList.add(num);
    }

    public List<Integer> getResultList() {
        return resultList;
    }

    public void removeResult() {
        resultList.remove(0);
    }
}
