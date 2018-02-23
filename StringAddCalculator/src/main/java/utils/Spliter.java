package utils;

public interface Spliter {
    boolean support(String inputValue);
    String[] split(String inputValue);
}
