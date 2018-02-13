package domain;

public class StringCalculator {

    public static int calculate(String inputValue){
        if(isBlank(inputValue)){
            throw new IllegalArgumentException();
        }

        return 0;
    }

    private static String[] split(String inputValue) {
        return inputValue.split(" ");
    }

    private static boolean isBlank(String inputValue) {
        return inputValue.isEmpty() || inputValue == null;
    }
}
