package dto;

import domain.Number;

public class CalculateResult {
    private Number result;

    public CalculateResult(Number result) {
        this.result = result;
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }
}
