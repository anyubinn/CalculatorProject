package lv3.arithmetic;

/**
 * 연산을 수행하는 기능을 제공하는 함수형 인터페이스
 * */
@FunctionalInterface
public interface Calculator <T extends Number> {
    T calculate(T num1, T num2);
}
