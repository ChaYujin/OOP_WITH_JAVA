package view;

import dto.CalculateResult;

public class OutputView {
    public static void printResult(CalculateResult result) {
        System.out.println("연산의 결과는 " + result.getResult() + "입니다.");
    }
}
