import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void plus() {
        assertThat(calculator.plus(1,2)).isEqualTo(3);
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(2,1)).isEqualTo(1);
    }

    @Test
    public void multiply() {
        assertThat(calculator.multifly(4,2)).isEqualTo(8);
    }

    @Test
    public void devide() {
        assertThat(calculator.divide(4,2)).isEqualTo(2);
    }
}
