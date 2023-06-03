package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverse();
        printMultiplication();
        removingArrayElements();
        displayArrayElementsLadder();
        generateUniqueNumbers();
        copyNonBlankLines();
    }

    public static void reverse() {
        System.out.print("1. Реверс значений массива");
        int[] numbers = {1, 7, 5, 2, 6, 4, 3};

        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int index = (numbers.length - 1) - i;
            int transitNumber = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = transitNumber;
        }

        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void printMultiplication() {
        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] numbers = new int[10];
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            if (i > 0 && i < 9) {
                result *= i;
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            str.append((i == 0 || i == 9) ? numbers[i] + "[" + i + "]\n" :
                    (i == 8) ? numbers[i] + " = " + result + "\n" : numbers[i] + " * ");
        }
        System.out.println(str);
    }

    public static void removingArrayElements() {
        System.out.println("3. Удаление элементов массива");
        double[] numbers = new double[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        printArray(numbers, 0, 7);
        printArray(numbers, 8, 14);
        int index = numbers.length / 2;
        double checkNumber = numbers[index];
        int zeroCells = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > checkNumber) {
                numbers[i] = 0;
                zeroCells++;
            }
        }
        System.out.println("Изменённый массив: ");
        printArray(numbers, 0, 7);
        printArray(numbers, 8, 14);
        System.out.println("Количество обнулённых ячеек: " + zeroCells);
    }

    public static void displayArrayElementsLadder() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] chars = new char[26];
        int i = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            chars[i++] = ch;
        }
        for (i = chars.length - 1; i >= 0; i--) {
            for (int j = chars.length - 1; j > i - 1; j--) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    public static void generateUniqueNumbers() {
        System.out.print("\n5. Генерация уникальных чисел\n");
        int[] ints = new int[30];
        int min = 60;
        int max = 100;
        for (int i = 0; i < ints.length; i++) {
            int[] ints1 = new int[i];
            if (i == 0) {
                ints[i] = rnd(min, max);
            } else {
                do {
                    ints[i] = rnd(min, max);
                    System.arraycopy(ints, 0, ints1, 0, i);
                } while (isRepeat(ints1, ints[i]));
            }
        }
        int[] sortInts = new int[30];
        sortInts = sort(ints);
        int count = 0;
        for (int anInt : sortInts) {
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
        String[] strings1 = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
//        String[] strings1 = {"    ", ""};
//        String[] strings1 = {"    ", "AA", "", "E", "FF", "G", ""};
//        String[] strings1 = {"FF", "G", ""};
        int notEmptySegments = countNotEmptySegments(strings1);
        int[][] params = getParams(strings1, notEmptySegments);
        int strings2Length = 0;
        for (int[] ints : params) {
            strings2Length += ints[2];
        }
        String[] strings2 = new String[strings2Length];
        for (int[] param : params) {
            System.arraycopy(strings1, param[0], strings2, param[1], param[2]);
        }
        System.out.println(Arrays.deepToString(strings1));
        System.out.println(Arrays.deepToString(strings2));
    }

    private static void printArray(double[] numbers, int firstIndex, int lastIndex) {
        for (int i = firstIndex; i <= lastIndex; i++) {
            System.out.printf("%.3f  ", numbers[i]);
        }
        System.out.println();
    }

    private static int rnd(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    private static boolean isRepeat(int[] ints, int number) {
        for (int anInt : ints) {
            if (anInt == number) {
                return true;
            }
        }
        return false;
    }

    private static int[] sort(int[] array) {
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
        return array;
    }

    private static boolean isEmptyString(String string) {
        return string.trim().isEmpty();
    }

    private static boolean isNotEmptyString(String string) {
        return !string.trim().isEmpty();
    }

    private static int countNotEmptySegments(String[] strings) {
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (i == 0 && isNotEmptyString(strings[i])) {
                count++;
            }
            if (i > 0 && isNotEmptyString(strings[i]) && isEmptyString(strings[i - 1])) {
                count++;
            }
        }
        return count;
    }

    private static int[][] getParams(String[] strings, int countSegments) {
        int[][] params = new int[countSegments][3];
        int segment = 0;
        for (int i = 0; i < strings.length; i++) {
            if ((i == 0 && isNotEmptyString(strings[i])) ||
                    (i > 0 && isNotEmptyString(strings[i]) && isEmptyString(strings[i - 1]))) {
                // srcPos
                params[segment][0] = i;
                // length
                int length = 1;
                while (isNotEmptyString(strings[i + length])) {
                    length++;
                }
                params[segment][2] = length;
                //destPos
                if (segment == 0) {
                    params[segment][1] = 0;
                } else {
                    params[segment][1] = params[segment - 1][1] + params[segment - 1][2];
                }
                segment++;
            }
        }
        return params;
    }
}
