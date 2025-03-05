package org.example.lv1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results; // 컬렉션

    public Calculator() {
        results = new ArrayList<>();
    }

    // 연산 수행 메서드
    public int calculate(int num1, int num2, char operator) {
        int result = 0;
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
                    return 0;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("오류: 올바른 연산 기호를 입력하세요.");
                return 0;
        }
        results.add(result); // 연산 결과 저장
        return result;
    }

    // Getter
    public List<Integer> getResults() {
        return new ArrayList<>(results); // 캡슐화
    }

    // 가장 오래된 연산 결과 삭제
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 연산 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }
}
