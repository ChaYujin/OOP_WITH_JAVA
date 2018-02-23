package domain;

import utils.CustomSplitter;
import utils.DefaultSplitter;
import utils.Spliter;

import java.util.Arrays;
import java.util.List;

public class StringAddCalculator {
    private Positive result;
    private List<Spliter> spliters = Arrays.asList(new DefaultSplitter(), new CustomSplitter());

    public StringAddCalculator(){
        result = new Positive(0);
    }

    public Positive add(String inputValue) {

        if(isBlank(inputValue)) {
            return new Positive(0);
        }

        for (String value : getSpliter(inputValue).split(inputValue)) {
            System.out.println(value);
            result.add(new Positive(toInt(value)));
        }

        return result;
    }

    private Spliter getSpliter(String inputValue){
        return  spliters.stream()
                .filter(s->s.support(inputValue))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
    }

    private int toInt(String inputValue) {
        return Integer.parseInt(inputValue);
    }

    private boolean isBlank(String inputValue) {
        return inputValue == null || inputValue.isEmpty();
    }
}
