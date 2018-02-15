package domain;

import utils.StringUtils;

public class StringCalculator {

    public static int calculate(String inputValue){
        if(isBlank(inputValue)){
            throw new IllegalArgumentException();
        }

        String[] splitValues = StringUtils.split(inputValue);
        int result = StringUtils.toInt(splitValues[0]);

        for (int i = 1; i < splitValues.length; i+=2) {
            if("+".equals(splitValues[i])){
                result += StringUtils.toInt(splitValues[i+1]);
            }
            if("-".equals(splitValues[i])){
                result -= StringUtils.toInt(splitValues[i+1]);
            }
            if("*".equals(splitValues[i])){
                result *= StringUtils.toInt(splitValues[i+1]);
            }
            if("/".equals(splitValues[i])){
                result /= StringUtils.toInt(splitValues[i+1]);
            }
        }

        return result;
    }

    public static boolean isBlank(String inputValue) {
        return inputValue.isEmpty() || inputValue == null;
    }
}
