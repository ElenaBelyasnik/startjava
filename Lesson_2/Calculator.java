import java.util.Scanner;

public class Calculator {
    private int argument1 = 1;
    private int argument2 = 1;
    private String sign = "+";
    private double result = 0;


    public void execution() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");
        do {
            this.readArgs();
            result = analyzeAndCalculate();
            System.out.println(argument1 + " " + sign + " " + argument2 + " = " + result);
        } while (!askForContinuation().equals("no"));
    }

    private String askForContinuation() {
        Scanner scanner = new Scanner(System.in);
        boolean stopAsk;
        String continuation = "yes";
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            continuation = scanner.next();
            stopAsk = continuation.equals("no") | continuation.equals("yes");
        } while (!stopAsk);
        return continuation;
    }

    private void readArgs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int arg1 = scanner.nextInt();
        this.setArgument1(arg1);
        System.out.println("Введите знак математической операции: ");
        String sign = scanner.next();
        this.setSign(sign);
        System.out.println("Введите второе число: ");
        int arg2 = scanner.nextInt();
        this.setArgument2(arg2);
    }

    private double analyzeAndCalculate() {
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

