package lv3;

import lv3.io.CalculatorInput;

public class Main {

    public static void main(String[] args) {

        String input = "";
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        while (!input.equals("exit")) {
            Number num1 = CalculatorInput.inputNumber();
            Number num2 = CalculatorInput.inputNumber();
            OperatorType operator = CalculatorInput.inputOperator();
            Number result = null;
            try {
                result = arithmeticCalculator.calculate(num1, num2, operator);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(result);

            input = CalculatorInput.inputAgain();
        }
    }
}
