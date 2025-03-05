package lv3.arithmetic;

@FunctionalInterface
public interface Calculator <T extends Number> {
    T calculate(T num1, T num2);
}
