package lv3;

public class ArithmeticCalculator {

    public <T extends Number> double calculate(T num1, T num2, char operator) {
        switch (operator) {
            case '+':
                return OperatorType.PLUS.calculate(num1, num2);
            case '-':
                return OperatorType.MINUS.calculate(num1, num2);
            case '*':
                return OperatorType.MULTIPLY.calculate(num1, num2);
            case '/':
                return OperatorType.DIVIDE.calculate(num1, num2);
        }
        return 0;
    }
}
