package lv3;

import lv3.io.CalculatorInput;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        Number num1 = CalculatorInput.inputNumber();
        Number num2 = CalculatorInput.inputNumber();
        OperatorType operator = CalculatorInput.inputOperator();
        Number result = arithmeticCalculator.calculate(num1, num2, operator);
        System.out.println(result);
    }
}
