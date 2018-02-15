import domain.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest{

    StringCalculator stringCalculator;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculate_isEmpty() {
        StringCalculator.calculate("");
    }

    @Test
    public void isBlank() {
        assertThat(StringCalculator.isBlank("")).isEqualTo(true);
    }

    @Test
    public void calculate_simple() {
        assertThat(StringCalculator.calculate("3 + 4")).isEqualTo(7);
    }

    @Test
    public void calculate_complex() {
        assertThat(StringCalculator.calculate("3 + 4 * 2")).isEqualTo(14);
    }
}
