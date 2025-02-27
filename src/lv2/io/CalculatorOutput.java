package lv2.io;

import java.util.List;

public class CalculatorOutput {

    public static void printDivider() {
        System.out.println("-------------------------------------");
    }

    public static void printOneResult(int num1, int num2, char operator, Integer result) {
        if (result != null) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

    public static void printAllResults(List<String> results) {
        System.out.println("누적 결과: ");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
