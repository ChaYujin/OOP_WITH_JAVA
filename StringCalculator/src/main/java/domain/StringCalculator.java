package domain;

import utils.StringUtils;

public class StringCalculator {

    public static Number calculator(String inputValue){
        if(isBlank(inputValue)){
            throw new IllegalArgumentException();
        }

        String[] splitValues = StringUtils.split(inputValue);
        Number number = new Number(StringUtils.toInt(splitValues[0]));
        for (int i = 1; i < splitValues.length; i+=2) {
            number = number.calculate(splitValues[i], new Number(StringUtils.toInt(splitValues[i+1])));
        }

        return number;
    }

    public static boolean isBlank(String inputValue) {
        return inputValue.isEmpty() || inputValue == null;
    }
}
