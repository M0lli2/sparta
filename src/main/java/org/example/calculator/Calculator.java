package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // 입력

            System.out.print("첫 번째 숫자 입력 (종료하려면 '종료' 입력): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("종료")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            int num1 = Integer.parseInt(input);

            System.out.print("사칙연산 기호 입력 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자 입력: ");
            int num2 = scanner.nextInt();

            // 계산

            int result = 0;
            boolean validOperation = true;

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
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("오류: 올바른 연산 기호를 입력하세요.");
                    validOperation = false;
            }

            // 결과
            if (validOperation) {
                System.out.println("결과: " + result);
            }
        }

        scanner.close();
    }
}
