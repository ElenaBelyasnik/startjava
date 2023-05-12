public class Calculator {
    private int argument1;
    private int argument2;
    private String sign;

    public Calculator(int argument1, int argument2, String sign) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.sign = sign;
    }

    public int getArgument1() {
        return argument1;
    }

    public void setArgument1(int argument1) {
        this.argument1 = argument1;
    }

    public int getArgument2() {
        return argument2;
    }

    public void setArgument2(int argument2) {
        this.argument2 = argument2;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String calculate() {
        int res = 0;
        switch (sign) {
            case "+":
                return String.valueOf(argument1 + argument2);
            case "-":
                return String.valueOf(argument1 - argument2);
            case "*":
                return String.valueOf(argument1 * argument2);
            case "/":
                return String.valueOf((double) argument1 / argument2);
            case "%":
                return String.valueOf(argument1 % argument2);
            case "^":
                res = argument1;
                for (int i = 0; i < argument2; i++) {
                    res *= argument1;
                }
                return String.valueOf(res);
            default:
                return "Введенная математическая операция не поддерживается";
        }
    }
}
