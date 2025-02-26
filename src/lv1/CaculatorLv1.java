package lv1;

import java.util.Scanner;

public class CaculatorLv1 {

    private int num1;
    private int num2;
    private char operator;
    private Scanner sc = new Scanner(System.in);

    public void startCalculate() {
        inputNumber();
        inputOperator();
    }

    // 양의 정수 2개를 입력받는 메서드
    private void inputNumber() {
        System.out.print("양의 정수 두 개를 입력하세요 (0부터 입력 가능): ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("입력한 값: " + num1 + ", " + num2);
    }

    // 사칙연산 기호를 입력받는 메서드
    private void inputOperator() {
        sc.nextLine(); // 버퍼 비우기
        System.out.print("사칙연산 기호를 입력하세요 (+, -, *, / 가능): ");
        operator = sc.nextLine().charAt(0);
        System.out.println("입력한 기호: " + operator);
    }
}
