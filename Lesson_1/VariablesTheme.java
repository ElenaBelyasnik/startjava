public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte ramSize = 8;
        short cpuCoreNum = 8;
        int diskDriveCapacity = 233;
        long numberThreads = 2283;
        float cpuFrequency = 2.1f;
        double cpuSpeed = 1.97;
        char diskDriveName = 'C';
        boolean availableWifi = true;
        System.out.println(ramSize + " - " + "размер оперативной памяти");
        System.out.println(cpuCoreNum + " - " + "количество ядер процессора");
        System.out.println(diskDriveCapacity + " - " + "ёмкость дискового накопителя");
        System.out.println(numberThreads + " - " + "количество потоков");
        System.out.println(cpuFrequency + " - " + "частота процессора");
        System.out.println(cpuSpeed + " - " + "скорость ЦПУ");
        System.out.println(diskDriveName + " - " + "название дискового накопителя");
        System.out.println(availableWifi + " - " + "наличие wi-fi");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrise = 100;
        int bookPrise = 200;
        int percentDiscount = 11;
        int totalPriceWithoutDiscount = penPrise + bookPrise;
        int discountAmount = (totalPriceWithoutDiscount * percentDiscount) / 100;
        int discountPrice = totalPriceWithoutDiscount - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + totalPriceWithoutDiscount);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMaxVal = 127;
        short shortMaxVal = 32_767;
        int intMaxVal = 2_147_483_647;
        long longMaxVal = 9_223_372_036_854_775_807L;
        System.out.println(byteMaxVal + "   " + (++byteMaxVal) + "   " + (--byteMaxVal));
        System.out.println(shortMaxVal + "   " + (++shortMaxVal) + "   " + (--shortMaxVal));
        System.out.println(intMaxVal + "   " + (++intMaxVal) + "   " + (--intMaxVal));
        System.out.println(longMaxVal + "   " + (++longMaxVal) + "   " + (--longMaxVal));

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("с помощью третьей переменной");
        System.out.println("Исходные значения переменных: n1 = " + num1 + " n2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Новые значения переменных: n1 = " + num1 + " n2 = " + num2);
        System.out.println("с помощью арифметических операций");
        System.out.println("Исходные значения переменных: n1 = " + num1 + " n2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: n1 = " + num1 + " n2 = " + num2);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: n1 = " + num1 + " n2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: n1 = " + num1 + " n2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underScore = '_';
        System.out.println(hash + "   " + (byte) hash);
        System.out.println(ampersand + "   " + (byte) ampersand);
        System.out.println(at + "   " + (byte) at);
        System.out.println(caret + "   " + (byte) caret);
        System.out.println(underScore + "   " + (byte) underScore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char leftParentheses = '(';
        char rightParentheses = ')';
        System.out.println("    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underScore + leftParentheses + " " + rightParentheses + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underScore + underScore + underScore + underScore + slash +
                backSlash + underScore + underScore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 523;
        int hundreds = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Cумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение его цифр = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int timeInSecond = 86399;
        int second = timeInSecond % 60;
        int minut = timeInSecond / 60 % 60;
        int hour = timeInSecond / 60 / 60;
        System.out.println(hour + ":" + minut + ":" + second);
    }
}