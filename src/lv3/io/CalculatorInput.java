package lv3.io;

import java.util.Scanner;
import java.util.Set;
import lv3.OperatorType;

public class CalculatorInput {
    static Scanner sc = new Scanner(System.in);
    static Set<String> operators = Set.of("+", "-", "*", "/");

    public static Number inputNumber() {
        while (true) {
            try {
                System.out.print("양수를 입력하세요(0부터 가능): ");
                String numStr = sc.nextLine().trim();
                if (numStr.isEmpty()) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }

                Number num = Double.valueOf(numStr);
                if (num.doubleValue() < 0) {
                    System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
                    continue;
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("적절하지 않은 숫자 형식입니다. 다시 입력해주세요.");
            }
        }
    }

    public static OperatorType inputOperator() {
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, / 가능): ");
            String operator = sc.nextLine();
            switch (operator) {
                case "+":
                    return OperatorType.PLUS;
                case "-":
                    return OperatorType.MINUS;
                case "*":
                    return OperatorType.MULTIPLY;
                case "/":
                    return OperatorType.DIVIDE;
                default:
                    System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
            }
        }
    }

    public static String inputAgain() {
        System.out.print("계속하려면 아무 키나 입력하고 종료하려면 'exit' 키를 입력하세요: ");
        String input = sc.nextLine();
        return input;
    }
}
