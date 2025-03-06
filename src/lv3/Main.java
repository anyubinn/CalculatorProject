package lv3;

import java.util.List;
import lv3.arithmetic.ArithmeticCalculator;
import lv3.arithmetic.OperatorType;
import lv3.io.CalculatorInput;
import lv3.io.CalculatorOutput;

public class Main {

    public static void main(String[] args) {

        String input = "";

        // ArithmeticCalculator 객체 생성
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        // 사용자가 exit을 입력할 때까지 반복
        while (!input.equals("exit")) {
            CalculatorOutput.printDivider();

            // 숫자 입력
            Number num1 = CalculatorInput.inputNumber();
            Number num2 = CalculatorInput.inputNumber();
            CalculatorOutput.printDivider();

            // 연산자 입력
            OperatorType operator = CalculatorInput.inputOperator();
            CalculatorOutput.printDivider();

            Number result = null;
            try {
                // 연산 수행
                result = arithmeticCalculator.calculate(num1, num2, operator);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            // 연산 결과 출력
            CalculatorOutput.printOneResult(num1, num2, operator, result);
            CalculatorOutput.printDivider();

            // 누적 연산 결과 출력
            List<Double> results = arithmeticCalculator.getResults();
            CalculatorOutput.printAllResults(results);
            CalculatorOutput.printDivider();

            // 입력값보다 더 큰 누적 연산 결과 출력
            List<Double> biggerResults = arithmeticCalculator.getBiggerResults(num1, num2);
            CalculatorOutput.printBiggerResults(biggerResults);

            // 계산기를 종료할지 입력
            input = CalculatorInput.inputAgain();
        }
    }
}
