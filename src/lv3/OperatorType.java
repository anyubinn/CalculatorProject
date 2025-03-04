package lv3;

public enum OperatorType {
    PLUS((a, b) -> a.doubleValue() + b.doubleValue()),
    MINUS((a, b) -> a.doubleValue() - b.doubleValue()),
    MULTIPLY((a, b) -> a.doubleValue() * b.doubleValue()),
    DIVIDE((a, b) -> a.doubleValue() / b.doubleValue());

    private final Calculator calculator;

    OperatorType(Calculator calculator) {
        this.calculator = calculator;
    }

    public <T extends Number> double calculate(T num1, T num2) {
        return (double) calculator.calculate(num1, num2);
    }
}
