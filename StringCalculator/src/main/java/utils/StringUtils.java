package utils;

public class StringUtils {

    public static int toInt(String splitValue) {
        return Integer.parseInt(splitValue);
    }

    public static String[] split(String inputValue) {
        return inputValue.split(" ");
    }
}
