package lv2;

import java.util.List;
import lv2.io.CalculatorInput;
import lv2.io.CalculatorOutput;

public class Main {
    public static void main(String[] args) {
        String input = "";

        // Calculator 객체 생성
        Calculator cal = new Calculator();

        // 사용자가 exit을 입력할 때까지 반복
        while (!input.equals("exit")){
            CalculatorOutput.printDivider();
            CalculatorOutput.printDivider();

            // 숫자 입력
            int num1 = CalculatorInput.inputNumber();
            int num2 = CalculatorInput.inputNumber();
            CalculatorOutput.printDivider();

            // 연산자 입력
            char operator = CalculatorInput.inputOperator();
            CalculatorOutput.printDivider();

            // 연산 결과 출력
            Integer result = cal.calculate(num1, num2, operator);
            CalculatorOutput.printOneResult(num1, num2, operator, result);
            CalculatorOutput.printDivider();

            // 누적 결과 출력
            List<String> results = cal.getResults();
            CalculatorOutput.printAllResults(results);

            CalculatorOutput.printDivider();
            CalculatorOutput.printDivider();

            // 계산기를 종료할지 입력
            input = CalculatorInput.inputAgain();
        }
    }
}