package lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
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
                System.out.println("다른 문자를 입력했습니다.");
                return;
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            int result = 0;
            try {
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("잘못된 사칙연산 기호입니다.");
                        return;
                }
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            System.out.println("result = " + result);
            System.out.print("계속하려면 아무 키나 입력하고 종료하려면 'exit' 키를 입력하세요: ");
            input = sc.next();
        }
        sc.close();
    }
}
