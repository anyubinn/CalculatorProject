package lv2;

import java.util.ArrayList;
import java.util.List;

/**
 * 연산과 관련된 처리를 담당하는 클래스
 * */
public class Calculator {
    // 누적 연산 결과를 저장하는 List
    private List<String> results;

    // Calculator 객체가 생성시 결과를 저장할 List 생성
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 입력 값을 이용해 사칙연산하는 메서드
    public Integer calculate(int num1, int num2, char operator) {
        int result = 0;
        try {
            // 연산자에 따라 계산 수행
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
            // 0으로 나누는 경우 예외처리
            System.out.println("0으로 나눌 수 없습니다.");
            return null;
        }
        // 연산 결과를 누적 연산 결과 List에 추가
        addResult(num1, num2, operator, result);
        // 오래된 누적 연산 결과 제거
        removeOldOneResults();

        return result;
    }

    // 누적 연산 결과 List를 반환하는 메서드
    public List<String> getResults() {
        return results;
    }

    // 누적 연산 결과 List에서 가장 오래된 결과를 제거하는 메서드
    private void removeOldOneResults() {
        // 누적 연산 결과는 최대 3개까지만 가능
        if (results.size() > 3) {
            results.remove(0);
        }
    }

    // 연산 결과를 누적 연산 결과 List에 추가하는 메서드
    private void addResult(int num1, int num2, char operator, Integer result) {
        results.add(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
