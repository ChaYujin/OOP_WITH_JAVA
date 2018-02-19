package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    private Positive result;

    public StringAddCalculator(){
        result = new Positive(0);
    }

    public Positive add(String inputValue) {
        if(isBlank(inputValue)) {
            return new Positive(0);
        }

        for (String value : split(inputValue)) {
            result.add(new Positive(toInt(value)));
        }

        return result;
    }

    private String[] split(String inputValue) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(inputValue);
        if (m.find()) {
            return m.group(2).split(m.group(1));
        }
        return inputValue.split(",|:");
    }

    private int toInt(String inputValue) {
        return Integer.parseInt(inputValue);
    }

    private boolean isBlank(String inputValue) {
        return inputValue == null || inputValue.isEmpty();
    }
}
