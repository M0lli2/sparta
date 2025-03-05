package org.example.lv2;

import java.util.Scanner;
import org.example.lv1.Calculator;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
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

            // 연산 수행 및 결과 출력
            int result = calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            // 연산 결과 출력
            System.out.println("현재 저장된 연산 결과: " + calculator.getResults());

            // 삭제 기능 활용
            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes/no): ");
            String deleteInput = scanner.next();
            if (deleteInput.equalsIgnoreCase("yes")) {
                calculator.removeFirstResult();
            }

            System.out.println("더 계산하시겠습니까? (종료 입력 시 종료)");
        }

        scanner.close();
    }
}

