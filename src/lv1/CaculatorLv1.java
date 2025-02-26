package lv1;

import java.util.Scanner;

public class CaculatorLv1 {

    private int num1;
    private int num2;
    private Scanner sc = new Scanner(System.in);

    public void startCalculate() {
        inputNumber();
    }

    private void inputNumber() {
        System.out.print("양의 정수 두 개를 입력하세요 (0부터 입력 가능): ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("입력한 값: " + num1 + ", " + num2);
    }
}
