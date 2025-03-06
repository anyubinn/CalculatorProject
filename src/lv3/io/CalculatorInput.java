package lv3.io;

import java.util.Scanner;
import lv3.arithmetic.OperatorType;

/**
 * 입력과 관련된 처리를 담당하는 클래스
 * */
public class CalculatorInput {
    static Scanner sc = new Scanner(System.in);

    // 양수를 입력받는 메서드
    public static Number inputNumber() {
        // 올바른 양수를 입력할 때까지 반복
        while (true) {
            try {
                System.out.print("양수를 입력하세요(0부터 가능): ");
                String numStr = sc.nextLine().trim();

                // 아무것도 입력하지 않을 경우 다시 입력
                if (numStr.isEmpty()) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }

                Number num = Double.valueOf(numStr);
                // 음수일 경우 다시 입력
                if (num.doubleValue() < 0) {
                    System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
                    continue;
                }

                // 올바른 정수 입력시 해당 정수 반환
                return num;
            } catch (NumberFormatException e) {
                // 숫자가 아닌 문자 입력 시 예외처리
                System.out.println("적절하지 않은 숫자 형식입니다. 다시 입력해주세요.");
            }
        }
    }

    // 사칙 연산자를 입력받는 메서드
    public static OperatorType inputOperator() {
        // 올바른 사칙 연산자를 입력할 때까지 반복
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
                    // 올바른 연산자가 아닌 경우 다시 입력
                    System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
            }
        }
    }

    // 계속 진행할지 입력받는 메서드
    public static String inputAgain() {
        System.out.print("계속하려면 아무 키나 입력하고 종료하려면 'exit' 키를 입력하세요: ");
        String input = sc.nextLine();
        return input;
    }
}
