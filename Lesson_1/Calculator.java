public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int argument1 = 10;
        int argument2 = 4;
        char sign = '^';
        double result = 0;
        if (sign == '+') {
            result = argument1 + argument2;
        } else if (sign == '-') {
            result = argument1 - argument2;
        } else if (sign == '*') {
            result = argument1 * argument2;
        } else if (sign == '/') {
            result = argument1 / argument2;
        } else if (sign == '^') {
            result = argument1;
            for (int i = 0; i < argument2; i++) {
                result *= argument1;
            }
        } else if (sign == '%') {
            result = argument1 % argument2;
        }
        System.out.println(argument1 + " " + sign + " " + argument2 + "=" + result);
    }
}
