import domain.Positive;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositiveTest {
    Positive positive;

    @Before
    public void setup() {
        positive = new Positive(3);
    }

    @Test
    public void calculate() {
        assertThat(positive.calculate("+", new Positive(3)).equals(new Positive(6))).isEqualTo(true);
    }
}
