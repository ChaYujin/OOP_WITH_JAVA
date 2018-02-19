package domain;

import java.util.Objects;

public class Positive {
    private int value;

    public Positive(int value){
        this.value = value;
    }

    public Positive calculate(String operator, Positive positive){
        return Calculation.SearchOperator(operator).calculate(this, positive);
    }

    private enum Calculation {
        PLUS("+", new Calculator(){
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        }),
        MINUS("-", new Calculator(){
            @Override
            public int calculate(int number1, int number2) {
                return number1 - number2;
            }
        }),
        MULTIFLY("*", new Calculator(){
            @Override
            public int calculate(int number1, int number2) {
                return number1 * number2;
            }
        }),
        DIVIDE("/", new Calculator(){
            @Override
            public int calculate(int number1, int number2) {
                return number1 / number2;
            }
        });

        private String operator;
        private Calculator calculator;

        Calculation(String operator, Calculator calculator) {
            this.operator = operator;
            this.calculator = calculator;
        }

        private Positive calculate(Positive positive1, Positive positive2) {
            return new Positive(this.calculator.calculate(positive1.value, positive2.value));
        }

        private static Calculation SearchOperator(String operator) {
            for(Calculation calculation : Calculation.values()){
                if(calculation.isEquals(operator)){
                    return calculation;
                }
            }
            throw new IllegalArgumentException();
        }

        private boolean isEquals(String operator) {
            return this.operator.equals(operator);
        }

        private interface Calculator {
            int calculate(int number1, int number2);
        }
    }

    @Override
    public String toString() {
        return value+"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Positive positive = (Positive) o;
        return this.value == positive.value;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
