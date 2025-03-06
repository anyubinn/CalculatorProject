package lv3.arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 연산과 관련된 처리를 담당하는 클래스
 * */
public class ArithmeticCalculator {

    // 누적 연산 결과를 저장하는 List
    private List<Double> results;

    // ArithmeticCalculator 객체 생성시 결과를 저장할 List 생성
    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    // 입력 값을 이용해 사칙연산하는 메서드
    public <T extends Number> double calculate(T num1, T num2, OperatorType operator) {
        // 연산자에 따라 계산 수행
        double result = operator.calculate(num1, num2);
        // 연산 결과를 누적 연산 결과 List에 추가
        results.add(result);
        // 오래된 누적 연산 결과 제거
        removeOldOneResults();
        return result;
    }

    // 누적 연산 결과 List를 반환하는 메서드
    public List<Double> getResults() {
        return results;
    }

    // 누적 연산 결과 List에서 가장 오래된 결과를 제거하는 메서드
    private void removeOldOneResults() {
        // 누적 연산 결과는 최대 3개까지만 가능
        if (results.size() > 3) {
            results.remove(0);
        }
    }

    // 누적 연산 결과 중 입력값보다 큰 결과를 반환하는 메서드
    public <T extends Number> List<Double> getBiggerResults(T num1, T num2) {
        return results.stream()
                // 결과가 num1 또는 num2보다 큰 값을 필터링
                .filter(results -> results.compareTo((Double) num1) > 0 || results.compareTo((Double) num2) > 0)
                // List 형태로 반환
                .collect(Collectors.toList());
    }
}