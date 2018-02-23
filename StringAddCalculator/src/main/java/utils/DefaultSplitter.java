package utils;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

public class DefaultSplitter implements Spliter {
    private static final List<String> DEFAULT_SEPARATORS = Arrays.asList(":", ",");

    @Override
    public boolean support(String inputValue) {
        try{
            inputValue.split(getDelimeter());
            return true;
        }catch(PatternSyntaxException pse){
            return false;
        }
    }

    @Override
    public String[] split(String inputValue) {
        return inputValue.split(getDelimeter());
    }

    private String getDelimeter() {
        return DEFAULT_SEPARATORS.stream().collect(Collectors.joining("|"));
    }
}
