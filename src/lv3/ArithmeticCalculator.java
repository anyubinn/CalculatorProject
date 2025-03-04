package lv3;

public class ArithmeticCalculator {

    public <T extends Number> double calculate(T num1, T num2, OperatorType operator) {
        return operator.calculate(num1, num2);
    }
}
