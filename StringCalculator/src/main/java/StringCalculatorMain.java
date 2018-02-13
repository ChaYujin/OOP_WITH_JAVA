import domain.StringCalculator;
import dto.CalculateResult;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class StringCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = InputView.inputStr(sc);

        CalculateResult result = new CalculateResult(StringCalculator.calculate(inputValue));

        OutputView.printResult(result);
    }
}
