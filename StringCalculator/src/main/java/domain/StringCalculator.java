package domain;

import utils.StringUtils;

public class StringCalculator {

    public static int calculator(String inputValue){
        if(isBlank(inputValue)){
            throw new IllegalArgumentException();
        }

        String[] splitValues = StringUtils.split(inputValue);
        int result = StringUtils.toInt(splitValues[0]);

        for (int i = 1; i < splitValues.length; i+=2) {
            result = calculate(splitValues[i], StringUtils.toInt(splitValues[i+1]), result);
        }

        return result;
    }

    public static int calculate(String operator, int value, int result) {
        if("+".equals(operator)){
            result += value;
        }
        if("-".equals(operator)){
            result -= value;
        }
        if("*".equals(operator)){
            result *= value;
        }
        if("/".equals(operator)){
            result /= value;
        }
        return result;
    }

    public static boolean isBlank(String inputValue) {
        return inputValue.isEmpty() || inputValue == null;
    }
}
