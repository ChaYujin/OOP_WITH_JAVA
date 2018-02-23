package view;

import dto.ResultDto;

public class OutputView {
    public static void printResult(ResultDto resultDto) {
        System.out.println("연산의 결과는 " + resultDto.getResult().toString() + "입니다.");
    }
}
