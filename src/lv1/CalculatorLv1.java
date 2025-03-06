package lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";

        // 사용자가 exit을 입력하기 전까지 반복
        while (!input.equals("exit")) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();

                // 입력된 숫자가 음수일 경우 종료
                if (num1 < 0) {
                    System.out.println("양의 정수만 입력이 가능합니다.");
                    return;
                }
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();

                if (num2 < 0) {
                    System.out.println("양의 정수만 입력이 가능합니다.");
                    return;
                }
            } catch (InputMismatchException e) {
                // 숫자가 아닌 다른 값을 입력했을 때 예외처리
                System.out.println("다른 문자를 입력했습니다.");
                return;
            }
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.nextLine().trim();

            // 연산 기호가 1글자가 아닐 경우 예외처리
            if (operator.length() != 1) {
                System.out.println("사칙연산 기호는 1글자만 가능합니다.");
                return;
            }
            int result = 0;
            try {
                // 입력한 연산자에 따른 사칙연산
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        // 잘못된 연산자가 입력된 경우
                        System.out.println("잘못된 사칙연산 기호입니다.");
                        return;
                }
            } catch (ArithmeticException e) {
                // 0으로 나누는 경우 예외처리
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            // 결과 출력
            System.out.println("result = " + result);

            // 계산기를 종료할지 입력받기
            System.out.print("계속하려면 아무 키나 입력하고 종료하려면 'exit' 키를 입력하세요: ");
            input = sc.next();
        }
        sc.close();
    }
}
