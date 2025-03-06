package lv3.io;

import java.util.List;
import lv3.arithmetic.OperatorType;

/**
 * 출력과 관련된 처리를 담당하는 클래스*/
public class CalculatorOutput {

    // 구분선을 출력하는 메서드
    public static void printDivider() {
        System.out.println("========================================");
    }

    // 입력받은 연산 결과를 출력하는 메서드
    public static void printOneResult(Number num1, Number num2, OperatorType operatorType, Number result) {
        // 결과가 null이 아니면 연산 결과 출력
        if (result != null) {
            System.out.println(num1 + " " + operatorType + " " + num2 + " = " + result);
        }
    }

    // 누적된 연산 결과를 출력하는 메서드
    public static void printAllResults(List<Double> results) {
        System.out.println("누적 결과: ");
        // List에 저장된 결과들을 하나씩 출력
        for (double result : results) {
            System.out.println(result);
        }
    }

    // 입력값보다 더 큰 누적 연산 결과를 출력하는 메서드
    public static void printBiggerResults(List<Double> results) {
        System.out.println("입력된 값 보다 큰 누적 결과: ");
        // List에 저장된 결과들을 하나씩 출력
        for (double result : results) {
            System.out.println(result);
        }
    }
}
