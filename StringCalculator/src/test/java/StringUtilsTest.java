import org.junit.Before;
import org.junit.Test;
import utils.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @Test
    public void toInt() {
        assertThat(StringUtils.toInt("3")).isEqualTo(3);
    }

    @Test
    public void split_space() {
        String[] str = {"1", "2"};
        assertThat(StringUtils.split("1 2")).isEqualTo(str);
    }

    @Test
    public void split_comma() {
        String[] str = {"1", "2"};
        assertThat(StringUtils.split("1,2")).isEqualTo(str);
    }

    @Test
    public void split_colon() {
        String[] str = {"1", "2"};
        assertThat(StringUtils.split("1:2")).isEqualTo(str);
    }

    @Test
    public void split_comma_colon() {
        String[] str = {"1", "2", "3"};
        assertThat(StringUtils.split("1:2,3")).isEqualTo(str);
    }

    @Test
    public void split_custom() {

    }
}
