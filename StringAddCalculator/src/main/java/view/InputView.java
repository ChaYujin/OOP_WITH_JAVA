package view;

import java.util.Scanner;

public class InputView {
    public static String inputValue(Scanner sc) {
        System.out.print("연산식을 입력하세요 : ");
        return sc.nextLine();
    }
}
