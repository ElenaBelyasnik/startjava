public class Calculator {
    private int arg1;
    private int arg2;
    private String sign;

    public Calculator(int arg1, int arg2, String sign) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.sign = sign;
    }

    public String calculate() {
        return "Результат: " + calculateMathOperation();
    }

    private double calculateMathOperation() {
        switch (sign) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return (double) arg1 / arg2;
            case "%":
                return arg1 % arg2;
            case "^":
                int result = 0;
                result = arg1;
                for (int i = 0; i < arg2; i++) {
                    result *= arg1;
                }
                return result;
            default:
                System.out.println("Введённая математическая операция не поддерживается");
        }
        return 0;
    }
}