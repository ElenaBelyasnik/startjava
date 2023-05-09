import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        do {
            Calculator calculator = readArgs();
            System.out.println(calculator.getArgument1() + " " + calculator.getSign() + " "
                    + calculator.getArgument2() + " = " + calculator.getResult());
        } while (!askForContinuation().equals("no"));
    }

    private static Calculator readArgs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int argument1 = scanner.nextInt();
        System.out.println("Введите знак математической операции: ");
        String sign = scanner.next();
        System.out.println("Введите второе число: ");
        int argument2 = scanner.nextInt();
        return new Calculator(argument1, argument2, sign);
    }

    private static String askForContinuation() {
        Scanner scanner = new Scanner(System.in);
        boolean stopAsk;
        String continuation;
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            continuation = scanner.next();
            stopAsk = continuation.equals("no") | continuation.equals("yes");
        } while (!stopAsk);
        return continuation;
    }
}
