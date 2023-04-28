public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java)");
        int age = 35;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }
        boolean mail = true;
        if (!mail) {
            System.out.println("femail");
        } else {
            System.out.println("mail");
        }
        double height = 1.5;
        if (height < 1.8) {
            System.out.println("Height < 1.8 m");
        } else {
            System.out.println("Height >= 1.8 m");
        }
        char firstNameLetter = "Michael".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("First Name Letter - M");
        } else if (firstNameLetter == 'I') {
            System.out.println("First Name Letter - I");
        } else {
            System.out.println("First Name Letter not in  (M, I)");
        }

        System.out.println("\n2. Поиск max и min числа");
        int n1 = 100;
        int n2 = 200;
        if (n1 == n2) {
            System.out.println("n1 = n2 = " + n1);
        } else if (n1 > n2) {
            System.out.println("max n1 = " + n1 + ", min n2 = " + n2);
        } else {
            System.out.println("max n2 = " + n2 + ", min n1 = " + n1);
        }

        System.out.println("\n3. Проверка числа");
        int num = -3;
        System.out.println("Исходное число = " + num);
        if (num == 0) {
        } else if (num % 2 == 0) {
            if (num > 0) {
                System.out.println("Чётное, положительное");
            } else {
                System.out.println("Чётное, отрицательное");
            }
        } else if (num % 2 != 0) {
            if (num > 0) {
                System.out.println("Нечётное, положительное");
            } else {
                System.out.println("Нечётное, отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int i1 = 123;
        int i2 = 223;
        System.out.println("Исходные числа: " + i1 + " и " + i2);
        if (i1 / 100 == i2 / 100) {
            System.out.println("Цифра " + i1 / 100 + " совпадает во втором разряде");
            if (i1 % 100 / 10 == i2 % 100 / 10) {
                System.out.println("Цифра " + i1 % 100 / 10 + " совпадает в первом разряде");
                if (i1 % 100 % 10 == i2 % 100 % 10) {
                    System.out.println("Цифра " + i1 % 100 % 10 + " совпадает в нулевом разряде");
                }
            }
        } else {
            System.out.println("Равных цифр во втором разряде нет. Остальные проверки не выполняем.");
        }

        System.out.println("\n5. Определение символа по его коду");
        char c = '\u0057';
        System.out.println("Символ: " + c);
        if (c >= '0' & c <= '9') {
            System.out.println("Это цифра");
        } else if ((c >= 'A' & c <= 'Z')) {
            System.out.println("Это большая буква");
        } else if (c >= 'a' & c <= 'z') {
            System.out.println("Это маленькая буква");
        } else {
            System.out.println("Это не цифра и не буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        double depositInterest = 0;
        System.out.println("Сумма вклада = " + depositAmount);
        if (depositAmount < 100_000) {
            depositInterest = 0.05;
        } else if (depositAmount >= 100_000 & depositInterest <= 300_000) {
            depositInterest = 0.07;
        } else if (depositAmount > 300_000) {
            depositInterest = 0.1;
        }
        double accruedInterest = Math.round(depositAmount * depositInterest);
        System.out.println("Начисленный % = " + accruedInterest);
        System.out.println("Итоговая сумма = " + (depositAmount + accruedInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPrc = 59;
        int programmingPrc = 91;
        int historyGrade = 0;
        int programmingGrade = 0;
        if (historyPrc <= 60) {
            historyGrade = 2;
        } else if (historyPrc > 60 & historyPrc <= 73) {
            historyGrade = 3;
        } else if (historyPrc > 73 & historyPrc <= 91) {
            historyGrade = 4;
        } else if (historyPrc > 91) {
            historyGrade = 5;
        }
        if (programmingPrc <= 60) {
            programmingGrade = 2;
        } else if (programmingPrc > 60 & programmingPrc <= 73) {
            programmingGrade = 3;
        } else if (programmingPrc > 73 & programmingPrc <= 91) {
            programmingGrade = 4;
        } else if (programmingPrc > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - история");
        System.out.println(programmingGrade + " - программирование");
        System.out.println("Средний балл оценок по предметам = " + ((historyGrade + programmingGrade) / 2));
        System.out.println("Средний % по предметам = " + ((historyPrc + programmingPrc) / 2));

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5_000;
        int saleAmount = 13_000;
        int goodsCost = 9_000;
        int annualProfit = (saleAmount - (rent + goodsCost)) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else if (annualProfit < 0) {
            System.out.println("Прибыль за год: " + annualProfit);
        } else {
            System.out.println("Прибыль за год: 0");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int usdAmount = 567;
        // исходное количество банкнот номиналом 100
        int nominal100 = 5;
        // исходное количество банкнот номиналом 10
        int nominal10 = 5;
        // исходное количество банкнот номиналом 1
        int nominal1 = 50;
        // промежуточное значение суммы для погашения.
        int currentUsdAmount = 567;
        // промежуточное количество банкнот номиналом 100
        int currentNominal100 = nominal100;
        // промежуточное количество банкнот номиналом 10
        int currentNominal10 = nominal10;
        // промежуточное количество банкнот номиналом 1
        int currentNominal1 = nominal1;
        // сколько понадобилось 100-долларовых банкнот
        int notes100 = 0;
        // сколько понадобилось 10-долларовых банкнот
        int notes10 = 0;
        // сколько понадобилось 1-долларовых банкнот
        int notes1 = 0;
        // если денег в банкомате недостаточно
        if (usdAmount > (nominal100 * 100 + nominal10 * 10 + nominal1)) {
            System.out.println("Недостаточно денег в банкомате");
        } else {
            while (currentUsdAmount > 99 & currentNominal100 > 0) {
                notes100 += 1;
                currentNominal100 -= 1;
                currentUsdAmount -= 100;
            }
            while (currentUsdAmount > 9 & currentNominal10 > 0) {
                notes10 += 1;
                currentNominal10 -= 1;
                currentUsdAmount -= 10;

            }
            while (currentUsdAmount > 0 & currentNominal1 > 0) {
                notes1 += 1;
                currentNominal1 -= 1;
                currentUsdAmount -= 1;
            }
            System.out.println("Сумма к выдаче в USD: " + usdAmount);
            System.out.println("Купюр номиналом 100 USD: " + notes100);
            System.out.println("Купюр номиналом 10 USD: " + notes10);
            System.out.println("Купюр номиналом 1 USD: " + notes1);
        }
    }
}
