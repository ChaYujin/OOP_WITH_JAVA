import domain.Number;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {
    Number number;

    @Before
    public void setup() {
        number = new Number(3);
    }

    @Test
    public void calculate() {
        assertThat(number.calculate("+", new Number(3)).equals(new Number(6))).isEqualTo(true);
    }
}
