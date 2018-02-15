package domain;

public class Number {
    private int value;

    public Number(int value){
        this.value = value;
    }

    public Number calculate(String operator, Number number){
        return Calculation.SearchOperator(operator).calculate(this, number);
    }

    private enum Calculation {
        PLUS("+", new Calculator(){
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        }),
        MINUX("-", new Calculator(){
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

        private Number calculate(Number number1, Number number2) {
            return new Number(this.calculator.calculate(number1.value, number2.value));
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
}
