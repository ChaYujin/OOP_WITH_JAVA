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
}
