package dto;

import domain.Positive;

public class ResultDto {
    private Positive result;

    public ResultDto(Positive result) {
        this.result = result;
    }

    public Positive getResult() {
        return result;
    }

    public void setResult(Positive result) {
        this.result = result;
    }
}
