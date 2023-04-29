public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter >= -10 & counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNumbers
                + ", а нечетных = " + sumOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + "  ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int reverseNumber = 1234;
        int digit;
        int sumDigits = 0;
        int i = 10;
        System.out.print("Число 1234 в обратном порядке: ");
        while (i <= 10000) {
            digit = (reverseNumber % i) / (i / 10);
            System.out.print(digit);
            sumDigits += digit;
            i *= 10;
        }
        System.out.println("\nСумма цифр числа " + reverseNumber + " : " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int right = 24;
        int delta = (5 - (right / 2) % 5) * 2;
        for (i = 1; i < right + delta; i += 2) {
            if (i > 1 & i % 5 == 1) {
                System.out.println();
            }
            if (i < right) {
                System.out.printf("%4d", i);
            } else {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int srcNumber = 3242592;
        i = 10;
        int countTwos = 0;
        while (i <= 10000000) {
            digit = (srcNumber % i) / (i / 10);
            if (digit == 2) {
                countTwos += 1;
            }
            i *= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("число " + srcNumber + " содержит " + countTwos
                    + " (четное) количество двоек");
        } else {
            System.out.println("число " + srcNumber + " содержит " + countTwos
                    + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int j = 0; j < 5; j++) {
            System.out.println("***********");
        }
        System.out.println();
        i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            i--;
        }
        System.out.println();
        i = 5;
        int k = 0;
        do {
            int j;
            if (i >= 3) {
                k++;
                j = k;
            } else {

                k--;
                j = k;
            }
            do {
                System.out.print("$");
                j--;
            } while (j > 0);
            System.out.println();
            i--;
        } while (i > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        char ch;
        System.out.println(" Dec Char");
        for (i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%5s%n", i, (char) i);
            }
        }
        System.out.println(" Dec Char");
        for (i = 97; i < 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%5s%n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        counter = 1234321;
        int reverseNum = 0;
        int currentNum = counter;
        while (currentNum > 0) {
            int firstNum = currentNum % 10;
            reverseNum = reverseNum * 10 + firstNum;
            currentNum = currentNum / 10;
        }
        if (counter == reverseNum) {
            System.out.println("Число " + counter + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        counter = 123321;
        int sum1 = 0;
        num1 = counter / 1000;
        currentNum = num1;
        while (currentNum > 0) {
            int firstNum = currentNum % 10;
            sum1 += firstNum;
            currentNum = currentNum / 10;
        }
        int sum2 = 0;
        num2 = counter % 1000;
        currentNum = num2;
        while (currentNum > 0) {
            int firstNum = currentNum % 10;
            sum2 += firstNum;
            currentNum = currentNum / 10;
        }
        System.out.println("Сумма цифр " + num1 + " = " + sum1);
        System.out.println("Сумма цифр " + num2 + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + counter + " является счастливым");
        } else {
            System.out.println("Число " + counter + "не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        for (i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    if (i == 1) {
                        System.out.printf("%2s", "|");
                    } else {
                        System.out.printf("%1d%1s", i, "|");
                    }

                } else {
                    System.out.printf("%3d", j * i);
                }
            }
            if (i == 1) {
                System.out.println("\n--------------------------");
            } else {
                System.out.println();
            }
        }
    }
}
