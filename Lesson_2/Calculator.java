public class Calculator {
    private int argument1;
    private int argument2;
    private String sign;

    public Calculator(int argument1, int argument2, String sign) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.sign = sign;
    }

    public boolean checkSign() {
        return switch (sign) {
            case "+", "-", "*", "/", "%", "^" -> true;
            default -> false;
        };
    }

    public double calculate() {
        switch (sign) {
            case "+":
                return argument1 + argument2;
            case "-":
                return argument1 - argument2;
            case "*":
                return argument1 * argument2;
            case "/":
                return (double) argument1 / argument2;
            case "%":
                return argument1 % argument2;
            case "^":
                int result = 0;
                result = argument1;
                for (int i = 0; i < argument2; i++) {
                    result *= argument1;
                }
                return result;
        }
        return 0;
    }
}