package lv2.io;

import java.util.List;

/**
 * 출력과 관련된 처리를 담당하는 클래스
 * */
public class CalculatorOutput {

    // 구분선을 출력하는 메서드
    public static void printDivider() {
        System.out.println("-------------------------------------");
    }

    // 입력받은 연산 결과를 출력하는 메서드
    public static void printOneResult(int num1, int num2, char operator, Integer result) {
        // 결과가 null이 아니면 연산 결과 출력
        if (result != null) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

    // 누적된 연산 결과를 출력하는 메서드
    public static void printAllResults(List<String> results) {
        System.out.println("누적 결과: ");
        // List에 저장된 결과들을 하나씩 출력
        for (String result : results) {
            System.out.println(result);
        }
    }
}
