package domain;

import java.util.Objects;

public class Positive {
    private int value;

    public Positive(int value) {
        if (value < 0) {
            throw new RuntimeException("음수를 입력하셨습니다.");
        }

        this.value = value;
    }

    public Positive add(Positive positive) {
        this.value += positive.value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Positive positive = (Positive) o;
        return value == positive.value;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
