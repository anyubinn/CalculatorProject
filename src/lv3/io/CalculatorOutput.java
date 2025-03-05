package lv3.io;

import java.util.List;
import lv3.OperatorType;

public class CalculatorOutput {

    public static void printDivider() {
        System.out.println("========================================");
    }

    public static void printOneResult(Number num1, Number num2, OperatorType operatorType, Number result) {
        if (result != null) {
            System.out.println(num1 + " " + operatorType + " " + num2 + " = " + result);
        }
    }

    public static void printAllResults(List<Double> results) {
        System.out.println("누적 결과: ");
        for (double result : results) {
            System.out.println(result);
        }
    }
}
