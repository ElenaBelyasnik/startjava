import java.util.Scanner;

public class CalculatorTest {
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        do {
            Calculator calculator = initiate();
            if (calculator.checkSign()) {
                System.out.println("Результат: " + calculator.calculate());
            } else {
                System.out.println("Введённая математическая операция не поддерживается");
            }
        } while (isNext());
    }

    private static Calculator initiate() {
        System.out.println("Введите первое число: ");
        int argument1 = console.nextInt();
        System.out.println("Введите знак математической операции: ");
        String sign = console.next();
        System.out.println("Введите второе число: ");
        int argument2 = console.nextInt();
        return new Calculator(argument1, argument2, sign);
    }

    private static boolean isNext() {
        String option;
        boolean yes;
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = console.next();
            yes = option.equals("yes");
        } while (!option.equals("yes") && !option.equals("no"));
        return yes;
    }
}