package domain;

import utils.StringUtils;

public class StringCalculator {

    public static Positive calculator(String inputValue){
        if(isBlank(inputValue)){
            return new Positive(0);
        }

        String[] splitValues = StringUtils.split(inputValue);
        Positive positive = new Positive(StringUtils.toInt(splitValues[0]));
        for (int i = 1; i < splitValues.length; i+=2) {
            positive = positive.calculate(splitValues[i], new Positive(StringUtils.toInt(splitValues[i+1])));
        }

        return positive;
    }

    public static boolean isBlank(String inputValue) {
        return inputValue.isEmpty() || inputValue == null;
    }
}
