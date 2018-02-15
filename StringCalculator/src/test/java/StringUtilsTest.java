import org.junit.Test;
import utils.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @Test
    public void toInt() {
        assertThat(StringUtils.toInt("3")).isEqualTo(3);
    }

    @Test
    public void split() {
        String[] str = {"1", "2"};
        assertThat(StringUtils.split("1 2")).isEqualTo(str);
    }
}
