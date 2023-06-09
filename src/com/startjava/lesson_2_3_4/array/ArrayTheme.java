package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverse();
        printMultiplication();
        removeElements();
        displayArrayElementsLadder();
        generateUniqueNumbers();
        copyNonBlankLines();
    }

    public static void reverse() {
        System.out.print("1. Реверс значений массива");
        int[] numbers = {1, 7, 5, 2, 6, 4, 3};
        int length = numbers.length;
        printIntArray(numbers);
        for (int i = 0; i < length / 2; i++) {
            int transitNumber = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = transitNumber;
        }
        printIntArray(numbers);
    }

    public static void printMultiplication() {
        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        int result = 1;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
            if (i > 0 && i < 9) {
                result *= i;
            }
        }
        StringBuilder str = new StringBuilder();
        int indexBeforeLast = length - 2;
        for (int i = 1; i <= indexBeforeLast; i++) {
            str.append(multipliers[i])
                    .append((i != indexBeforeLast) ? " * " : " = " + result + "\n");
        }
        str.append(multipliers[0]).append("[").append(0).append("]\n");
        str.append(multipliers[9]).append("[").append(9).append("]\n");
        System.out.println(str);
    }

    public static void removeElements() {
        System.out.println("3. Удаление элементов массива");
        double[] randomDoubles = new double[15];
        int length = randomDoubles.length;
        for (int i = 0; i < length; i++) {
            randomDoubles[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        printArray(randomDoubles);
        double middleCellValue = randomDoubles[length / 2];
        int zeroCells = 0;
        for (int i = 0; i < length; i++) {
            if (randomDoubles[i] > middleCellValue) {
                randomDoubles[i] = 0;
                zeroCells++;
            }
        }
        System.out.println("Изменённый массив: ");
        printArray(randomDoubles);
        System.out.println("Количество обнулённых ячеек: " + zeroCells);
    }

    public static void displayArrayElementsLadder() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (char i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = alphabet.length - 1; j > i - 1; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void generateUniqueNumbers() {
        System.out.print("\n5. Генерация уникальных чисел\n");
        int[] uniqueNumbers = new int[30];
        int min = 60;
        int max = 100;

        for (int i = 0; i < uniqueNumbers.length; i++) {
            int number;
            do {
                number = rnd(min, max);
            } while (!isUnique(uniqueNumbers, i, number));
            uniqueNumbers[i] = number;
        }
        sort(uniqueNumbers);
        int count = 0;
        for (int anInt : uniqueNumbers) {
            if (count == 10) {
                System.out.println();
                count = 0;
            }
            System.out.print(anInt + "   ");
            count++;
        }
    }

    public static void copyNonBlankLines() {
        System.out.print("\n\n6. Копирование не пустых строк\n");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
//        String[] srcStrings = {"    ", ""};
//        String[] srcStrings = {"    ", "AA", "", "E", "FF", "G", ""};
//        String[] srcStrings = {"FF", "G", ""};
        String[] nonEmptyStrings = new String[calculateNonEmptyLength(srcStrings)];
        int srcPos;
        int length = 0;
        int destPos = 0;
        int prevLength = 0;
        int prevDestPos = 0;
        int j = 0;
        for (int i = 0; i < srcStrings.length; ) {
            length = 0;
            while (isNotEmptyString(srcStrings[i + length])) {
                length++;
            }
            if (length > 0) {
                srcPos = i;
                destPos = prevDestPos + prevLength;
                prevDestPos = destPos;
                prevLength = length;
                System.arraycopy(srcStrings, srcPos, nonEmptyStrings, destPos, length);
                i += length;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.deepToString(srcStrings));
        System.out.println(Arrays.deepToString(nonEmptyStrings));
    }

    private static void printIntArray(int[] numbers) {
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void printArray(double[] numbers) {
        for (int i = 0; i <= 14; i++) {
            System.out.printf("%.3f  ", numbers[i]);
            if (i == 8 || i == 14) {
                System.out.println();
            }
        }
    }

    private static int rnd(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    private static boolean isUnique(int[] ints, int maxIndex, int number) {
        for (int i = 0; i <= maxIndex; i++) {
            if (ints[i] == number) {
                return false;
            }
        }
        return true;
    }

    private static void sort(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int calculateNonEmptyLength(String[] strings) {
        int nonEmptyLength = 0;
        for (String string : strings) {
            if (isNotEmptyString(string)) {
                nonEmptyLength++;
            }
        }
        return nonEmptyLength;
    }

    private static boolean isNotEmptyString(String string) {
        return !string.trim().isBlank();
    }
}
