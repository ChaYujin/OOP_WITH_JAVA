package dto;

import domain.Positive;

public class CalculateResult {
    private Positive result;

    public CalculateResult(Positive result) {
        this.result = result;
    }

    public Positive getResult() {
        return result;
    }

    public void setResult(Positive result) {
        this.result = result;
    }
}
