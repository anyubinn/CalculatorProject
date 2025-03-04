package lv3;

import java.util.List;
import lv3.arithmetic.ArithmeticCalculator;
import lv3.arithmetic.OperatorType;
import lv3.io.CalculatorInput;
import lv3.io.CalculatorOutput;

public class Main {

    public static void main(String[] args) {

        String input = "";
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        while (!input.equals("exit")) {
            CalculatorOutput.printDivider();

            Number num1 = CalculatorInput.inputNumber();
            Number num2 = CalculatorInput.inputNumber();
            CalculatorOutput.printDivider();

            OperatorType operator = CalculatorInput.inputOperator();
            CalculatorOutput.printDivider();

            Number result = null;
            try {
                result = arithmeticCalculator.calculate(num1, num2, operator);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            CalculatorOutput.printOneResult(num1, num2, operator, result);
            CalculatorOutput.printDivider();

            List<Double> results = arithmeticCalculator.getResults();
            CalculatorOutput.printAllResults(results);
            CalculatorOutput.printDivider();

            List<Double> biggerResults = arithmeticCalculator.getBiggerResults(num1, num2);
            CalculatorOutput.printBiggerResults(biggerResults);

            input = CalculatorInput.inputAgain();
        }
    }
}
