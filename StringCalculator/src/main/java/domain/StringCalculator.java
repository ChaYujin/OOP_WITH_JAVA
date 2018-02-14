package domain;

public class StringCalculator {

    public static int calculate(String inputValue){
        if(isBlank(inputValue)){
            throw new IllegalArgumentException();
        }
        String[] splitValues = inputValue.split(" ");
        int result = 0;

        return 0;
    }

    public static String[] split(String inputValue) {
        return inputValue.split(" ");
    }

    public static boolean isBlank(String inputValue) {
        return inputValue.isEmpty() || inputValue == null;
    }
}
