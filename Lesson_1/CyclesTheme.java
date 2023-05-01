public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sourceNumber = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (sourceNumber % 2 == 0) {
                sumEvenNumbers += sourceNumber;
            } else {
                sumOddNumbers += sourceNumber;
            }
            sourceNumber++;
        } while (sourceNumber >= -10 & sourceNumber <= 21);
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
        int initialNumber = 1234;
        int reverseNumber = initialNumber;
        int sumDigits = 0;
        System.out.print("Число " + reverseNumber + " в обратном порядке: ");
        while (reverseNumber > 0) {
            int digit = reverseNumber % 10;
            reverseNumber -= digit;
            reverseNumber /= 10;
            System.out.print(digit);
            sumDigits += digit;
        }
        System.out.println("\nСумма цифр числа " + initialNumber + " : " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int notIncludedRightEnd = 27;
        int totalPositionInRow = 5;
        int currentPositionCounter = 0;
        int totalNumbersInRows = 0;
        for (int i = 1; i < notIncludedRightEnd; i += 2) {
            currentPositionCounter++;
            totalNumbersInRows++;
            if (currentPositionCounter > totalPositionInRow) {
                currentPositionCounter = 1;
                System.out.println();
            }
            System.out.printf("%4d", i);
        }
        int delta = totalPositionInRow - totalNumbersInRows % totalPositionInRow;
        if (delta > 0 & delta < totalPositionInRow) {
            for (int i = 0; i < delta; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        sourceNumber = 3242592;
        int number = sourceNumber;
        int countTwos = 0;
        while (number > 0) {
            int digit = number % 10;
            number -= digit;
            number /= 10;
            if (digit == 2) {
                countTwos += 1;
            }
        }
        if (countTwos % 2 == 0) {
            System.out.println("число " + sourceNumber + " содержит " + countTwos
                    + " (четное) количество двоек");
        } else {
            System.out.println("число " + sourceNumber + " содержит " + countTwos
                    + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            System.out.println("***********");
        }
        System.out.println();
        int strings = 5;
        int characterInString = 5;
        while (strings > 0) {
            int count = characterInString;
            while (count > 0) {
                System.out.print("#");
                count--;
            }
            System.out.println();
            strings--;
            characterInString--;
        }
        System.out.println();
        strings = 1;
        int totalCharacterInString = 0;
        do {
            if (strings < 4) {
                totalCharacterInString++;
            } else {

                totalCharacterInString--;
            }
            int currentCharacterInString = totalCharacterInString;
            do {
                System.out.print("$");
                currentCharacterInString--;
            } while (currentCharacterInString > 0);
            System.out.println();
            strings++;
        } while (strings <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println(" Dec Char");
        for (int i = 0; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%5c%n", i, i);
            }
        }
        for (int i = 97; i < 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%5c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        sourceNumber = 1234321;
        reverseNumber = 0;
        int copySourceNumber = sourceNumber;
        while (copySourceNumber > 0) {
            int digit = copySourceNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            copySourceNumber /= 10;
        }
        if (sourceNumber == reverseNumber) {
            System.out.println("Число " + sourceNumber + " является палиндромом");
        } else {
            System.out.println("Число " + sourceNumber + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        sourceNumber = 123321;
        int sum1 = 0;
        int number1 = sourceNumber / 1000;
        int copySourceNumber1 = sourceNumber / 1000;
        int sum2 = 0;
        int number2 = sourceNumber % 1000;
        int copySourceNumber2 = sourceNumber % 1000;
        while (copySourceNumber1 > 0 | copySourceNumber2 > 0) {
            if (copySourceNumber1 > 0) {
                int digit = copySourceNumber1 % 10;
                sum1 += digit;
                copySourceNumber1 /= 10;
            }
            if (copySourceNumber2 > 0) {
                int digit = copySourceNumber2 % 10;
                sum2 += digit;
                copySourceNumber2 /= 10;
            }
        }
        System.out.println("Сумма цифр " + number1 + " = " + sum1);
        System.out.println("Сумма цифр " + number2 + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + sourceNumber + " является счастливым");
        } else {
            System.out.println("Число " + sourceNumber + "не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        for (int i = 1; i < 10; i++) {
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
