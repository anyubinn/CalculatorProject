package lv3.arithmetic;

/**
 * 사칙 연산자 타입을 나타내는 Enum
 * */
public enum OperatorType {
    // 각 연산자에 해당하는 연산 기능을 람다식으로 정의
    PLUS((a, b) -> a.doubleValue() + b.doubleValue()),
    MINUS((a, b) -> a.doubleValue() - b.doubleValue()),
    MULTIPLY((a, b) -> a.doubleValue() * b.doubleValue()),
    DIVIDE((a, b) -> {if (b.doubleValue() == 0) {
        // 0으로 나누는 경우 예외처리
        throw new ArithmeticException("0으로 나눌 수 없습니다.");
    }
            return a.doubleValue() / b.doubleValue();});

    // 함수형 인터페이스
    private final Calculator calculator;

    OperatorType(Calculator calculator) {
        this.calculator = calculator;
    }

    // Calculatr 인터페이스의 calculate 메서드 구현
    public <T extends Number> double calculate(T num1, T num2) {
        return (double) calculator.calculate(num1, num2);
    }
}
