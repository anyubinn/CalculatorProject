package lv3;

public enum OperatorType {
    PLUS((a, b) -> a + b),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);

    private final Calculator calculator;

    OperatorType(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(int num1, int num2) {
        return calculator.calculate(num1, num2);
    }
}
