import domain.StringCalculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest{
    @Test(expected = IllegalArgumentException.class)
    public void calculate_isEmpty() {
        StringCalculator.calculator("");
    }

    @Test
    public void isBlank() {
        assertThat(StringCalculator.isBlank("")).isEqualTo(true);
    }

    @Test
    public void calculator_complex() {
        assertThat(StringCalculator.calculator("3 + 4 * 2")).isEqualTo(14);
    }
}
