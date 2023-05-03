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
            reverseNumber /= 10;
            System.out.print(digit);
            sumDigits += digit;
        }
        System.out.println("\nСумма цифр числа " + initialNumber + " : " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int rightEnd = 30;
        int counter = 5;
        int currentPosition = 0;
        for (int i = 1; i < rightEnd; i += 2) {
            currentPosition++;
            if (currentPosition > counter) {
                currentPosition = 1;
                System.out.println();
            }
            System.out.printf("%4d", i);
        }
        int delta = counter - currentPosition;
        if (delta > 0 && delta < counter) {
            for (int i = 0; i < delta; i++) {
                System.out.printf("%4d", 0);
            }
        }


        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        sourceNumber = 3242592;
        int number = sourceNumber;
        int countTwos = 0;
        while (number > 0) {
            if ((number % 10) == 2) {
                countTwos++;
            }
            number /= 10;
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

        int lines = 5;
        int countCharsPerRow = 5;
        while (lines > 0) {
            int count = countCharsPerRow;
            while (count > 0) {
                System.out.print("#");
                count--;
            }
            System.out.println();
            lines--;
            countCharsPerRow--;
        }

        lines = 1;
        int totalCharacterInString = 0;
        do {
            if (lines < 4) {
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
            lines++;
        } while (lines <= 5);

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
        int leftSum = 0;
        int leftNumber = sourceNumber / 1000;
        int copyLeftNumber = leftNumber;
        int rightSum = 0;
        int rightNumber = sourceNumber % 1000;
        int copyRightNumber = rightNumber;
        while (copyRightNumber > 0) {
            leftSum += copyLeftNumber % 10;
            copyLeftNumber /= 10;
            rightSum += copyRightNumber % 10;
            copyRightNumber /= 10;
        }
        System.out.println("Сумма цифр " + leftNumber + " = " + leftSum);
        System.out.println("Сумма цифр " + rightNumber + " = " + rightSum);
        if (leftSum == rightSum) {
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
