package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculator(int num1, int num2, char operator) {
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
                default:
                    System.out.println("잘못된 사칙연산 기호입니다.");
            }
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
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
