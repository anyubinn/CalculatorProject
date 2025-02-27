package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public Integer calculator(int num1, int num2, char operator) {
        int result = 0;
        try {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            return null;
        }
        addResult(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    private void addResult(int result) {
        results.add(result);
    }
}
