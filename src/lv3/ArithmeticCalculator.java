package lv3;

public class ArithmeticCalculator {

    public Integer calculate(int num1, int num2, char operator) {
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
