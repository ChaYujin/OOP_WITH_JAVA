package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomSplitter implements Spliter {

    @Override
    public boolean support(String inputValue) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(inputValue);
        if (m.find()) {
           return true;
        }
        return false;
    }

    @Override
    public String[] split(String inputValue) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(inputValue);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            return tokens;
        }
        throw new IllegalArgumentException();
    }
}
