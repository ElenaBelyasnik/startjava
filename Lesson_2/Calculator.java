public class Calculator {
    private int argument1;
    private int argument2;
    private String sign;
    private double result;

    public Calculator(int argument1, int argument2, String sign) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.sign = sign;
        this.result = analyzeAndCalculate();
    }

    public double analyzeAndCalculate() {
        int res = 0;
        int arg1 = this.getArgument1();
        int arg2 = this.getArgument2();
        switch (this.getSign()) {
            case "+":
                res = arg1 + arg2;
                break;
            case "-":
                res = arg1 - arg2;
                break;
            case "*":
                res = arg1 * arg2;
                break;
            case "/":
                res = arg1 / arg2;
                break;
            case "%":
                res = arg1 % arg2;
                break;
            case "^":
                res = arg1;
                for (int i = 0; i < arg2; i++) {
                    res *= arg1;
                }
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается");
        }
        return res;
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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
