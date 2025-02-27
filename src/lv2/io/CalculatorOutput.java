package lv2.io;

public class CalculatorOutput {

    public static void printDivider() {
        System.out.println("-------------------------------------");
    }

    public static void printOneResult(int num1, int num2, char operator, Integer result) {
        if (result != null) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
