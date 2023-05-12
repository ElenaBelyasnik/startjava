import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        do {
            Calculator calculator = initiate();
            System.out.println("Результат: " + calculator.calculate());
        } while (isNext());
    }

    private static Calculator initiate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int argument1 = scanner.nextInt();
        System.out.println("Введите знак математической операции: ");
        String sign = scanner.next();
        System.out.println("Введите второе число: ");
        int argument2 = scanner.nextInt();
        return new Calculator(argument1, argument2, sign);
    }

    private static boolean isNext() {
        Scanner scanner = new Scanner(System.in);
        String option;
        boolean yes;
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            option = scanner.next();
            yes = option.equals("yes");
        } while (!(yes || option.equals("no")));
        return yes;
    }
}
