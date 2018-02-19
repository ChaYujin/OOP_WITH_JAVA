import static org.junit.Assert.*;

import domain.Positive;
import domain.StringAddCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalculatorTest {
        private StringAddCalculator cal;

        @Before
        public void setup() {
            cal = new StringAddCalculator();
        }

        @Test
        public void add_null_or_empty() {
            assertThat(cal.add(null).equals(new Positive(0))).isEqualTo(true);
            assertThat(cal.add("").equals(new Positive(0))).isEqualTo(true);
        }

        @Test
        public void add_one() throws Exception {
            assertThat(cal.add("1").equals(new Positive(1))).isEqualTo(true);
        }

        @Test
        public void add_comma() throws Exception {
            assertThat(cal.add("1,2").equals(new Positive(3))).isEqualTo(true);
        }

        @Test
        public void add_comma_or_colon() throws Exception {
            assertThat(cal.add("1,2:3").equals(new Positive(6))).isEqualTo(true);
        }

        @Test
        public void add_custom() throws Exception {
            assertThat(cal.add("//;\n1;2;3").equals(new Positive(6))).isEqualTo(true);

        }

        @Test(expected = RuntimeException.class)
        public void add_negative() throws Exception {
            cal.add("-1,2,3");
        }
}
