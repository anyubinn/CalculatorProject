package lv2.io;

import java.util.Scanner;
import java.util.Set;

/**
 * 입력과 관련된 처리를 담당하는 클래스
 * */
public class CalculatorInput {
    static Scanner sc = new Scanner(System.in);
    // 유효한 사칙 연산자를 저장하는 Set
    static Set<String> operators = Set.of("+", "-", "*", "/");

    // 양의 정수를 입력받는 메서드
    public static int inputNumber() {
        // 올바른 양의 정수를 입력할 때까지 반복
        while (true) {
            try {
                System.out.print("양의 정수를 입력하세요(0부터 가능): ");
                String numStr = sc.nextLine().trim();

                // 아무것도 입력하지 않을 경우 다시 입력
                if (numStr.isEmpty()) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }

                int num = Integer.parseInt(numStr);
                // 음수일 경우 다시 입력
                if (num < 0) {
                    System.out.println("음수는 입력할 수 없습니다. 다시 입력해주세요.");
                    continue;
                }

                // 올바른 정수 입력시 해당 정수 반환
                return num;
            } catch (NumberFormatException e) {
                // 숫자가 아닌 문자 입력 시 예외 처리
                System.out.println("적절하지 않은 숫자 형식입니다. 다시 입력해주세요.");
            }
        }
    }

    // 사칙 연산자를 입력받는 메서드
    public static char inputOperator() {
        // 올바른 사칙 연산자를 입력할 때까지 반복
        while (true) {
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, / 가능): ");
            String operator = sc.nextLine();

            // 올바른 연산자가 아닌 경우 다시 입력
            if (operator.length() != 1 || !operators.contains(operator)) {
                System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
                continue;
            }

            // 올바른 연산자 입력시 해당 연산자 반환
            return operator.charAt(0);
        }
    }

    // 계속 진행할지 입력받는 메서드
    public static String inputAgain() {
        System.out.print("계속하려면 아무 키나 입력하고 종료하려면 'exit' 키를 입력하세요: ");
        String input = sc.nextLine();
        return input;
    }
}
