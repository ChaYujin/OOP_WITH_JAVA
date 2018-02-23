import domain.StringAddCalculator;
import dto.ResultDto;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class StringAddCalculatorMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringAddCalculator stringAddCalculator = new StringAddCalculator();
        ResultDto resultDto = new ResultDto(stringAddCalculator.add(InputView.inputValue(sc)));
        OutputView.printResult(resultDto);
    }
}
