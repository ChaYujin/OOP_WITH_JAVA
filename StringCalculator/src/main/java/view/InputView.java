package view;

import java.util.Scanner;

public class InputView {
    public static String inputStr(Scanner sc){
        System.out.println("연산식을 입력하세요.");
        System.out.print("> ");
        return sc.nextLine();
    }
}
