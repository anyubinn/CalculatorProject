package lv1;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculatorLv1 {

    private int num1;
    private int num2;
    private char operator;
    private int result;
    private List<Character> operatorArr = List.of('+', '-', '*', '/');
    private Scanner sc = new Scanner(System.in);

    public void startCalculate() {
        String input = "";
        while (!input.equals("exit")){
            inputNumber();
            inputOperator();
            calculateResult();
            System.out.println("result = " + result);

            System.out.print("계속하려면 아무 키나 입력하고 종료하려면 'exit' 키를 입력하세요: ");
            input = sc.next();
        }
    }

    // 양의 정수 2개를 입력받는 메서드
    private void inputNumber() {
        try {
            System.out.print("양의 정수 두 개를 입력하세요 (0부터 입력 가능): ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수만 입력이 가능합니다. 다시 입력해주세요.");
                inputNumber();
            }
        } catch (InputMismatchException e) {
            System.out.println("다른 문자를 입력했습니다. 올바른 숫자를 입력해주세요.");
            sc.nextLine(); // 무한루프 방지
            inputNumber();
        }
    }

    // 사칙연산 기호를 입력받는 메서드
    private void inputOperator() {
        System.out.print("사칙연산 기호를 입력하세요 (+, -, *, / 가능): ");
        operator = sc.next().charAt(0);
        if (!operatorArr.contains(operator)) {
            System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
            inputOperator();
        }
    }

    // 입력된 정수와 연산 기호를 사용해 계산하는 메서드
    private int calculateResult() {
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
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    result = num1 / num2;
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            result = -999;
        }
        return result;
    }
}
