public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java)");
        int age = 35;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }
        boolean male = true;
        if (!male) {
            System.out.println("female");
        } else {
            System.out.println("male");
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
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.print("Чётное, ");
            } else {
                System.out.print("Нечётное, ");
            }
            if (num > 0) {
                System.out.println("положительное");
            } else {
                System.out.println("отрицательное");
            }
        } else {
            System.out.println(num);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 433;
        int num2 = 233;
        System.out.println("Исходные числа: " + num1 + " и " + num2);
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        boolean isHundredsMatch = hundreds1 == hundreds2;
        boolean isTensMatch = tens1 == tens2;
        boolean isOnesMatch = ones1 == ones2;
        boolean noEqualNumbers = !isHundredsMatch & !isTensMatch & !isOnesMatch;
        // если все цифры в разрядах разные, то остальные проверки выполняться не должны
        if (noEqualNumbers) {
            System.out.println("Равных цифр нет.");
        } else if (isHundredsMatch) {
            System.out.println("Цифра " + hundreds1 + " совпадает в третьем разряде");
            if (isTensMatch) {
                System.out.println("Цифра " + tens1 + " совпадает во втором разряде");
                if (isOnesMatch) {
                    System.out.println("Цифра " + ones2 + " совпадает в первом разряде");
                }
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char code = '\u0057';
        System.out.println("Символ: " + code);
        if (code >= '0' & code <= '9') {
            System.out.println("Это цифра");
        } else if (code >= 'A' & code <= 'Z') {
            System.out.println("Это большая буква");
        } else if (code >= 'a' & code <= 'z') {
            System.out.println("Это маленькая буква");
        } else {
            System.out.println("Это не цифра и не буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 300_000;
        double depositInterest = 0.05;
        System.out.println("Сумма вклада = " + depositAmount);
        if (depositAmount >= 100_000 & depositInterest <= 300_000) {
            depositInterest = 0.07;
        } else if (depositAmount > 300_000) {
            depositInterest = 0.1;
        }
        double accruedInterest = Math.round(depositAmount * depositInterest);
        System.out.println("Начисленный % = " + accruedInterest);
        System.out.println("Итоговая сумма = " + (depositAmount + accruedInterest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int historyGrade = 2;
        if (historyPercentage > 60 & historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage > 73 & historyPercentage <= 91) {
            historyGrade = 4;
        } else if (historyPercentage > 91) {
            historyGrade = 5;
        }
        int programmingProc = 91;
        int programmingGrade = 2;
        if (programmingProc > 60 & programmingProc <= 73) {
            programmingGrade = 3;
        } else if (programmingProc > 73 & programmingProc <= 91) {
            programmingGrade = 4;
        } else if (programmingProc > 91) {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - история");
        System.out.println(programmingGrade + " - программирование");
        System.out.println("Средний балл оценок по предметам = " + ((historyGrade + programmingGrade) / 2));
        System.out.println("Средний % по предметам = " + ((historyPercentage + programmingProc) / 2));

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5_000;
        int saleAmount = 13_000;
        int goodsCost = 9_000;
        int annualProfit = (saleAmount - (rent + goodsCost)) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int usd100InAtm = 5;
        int usd10InAtm = 5;
        int usd1InAtm = 50;
        int requiredUSDAmount = 567;
        int totalUSDAmountInATM = usd100InAtm * 100 + usd10InAtm * 10 + usd1InAtm;
        System.out.println("Сумма к выдаче в USD: " + requiredUSDAmount);
        if (requiredUSDAmount > totalUSDAmountInATM) {
            System.out.println("Недостаточно денег в банкомате");
        } else {
            int hundredsInAmount = requiredUSDAmount / 100;
            int tensInAmount = requiredUSDAmount % 100 / 10;
            int onesInAmount = requiredUSDAmount % 10;
            if (hundredsInAmount > usd100InAtm) {
                tensInAmount += (hundredsInAmount - usd100InAtm) * 10;
                hundredsInAmount = usd1InAtm;
            }
            if (tensInAmount > usd10InAtm){
                onesInAmount += (tensInAmount - usd10InAtm) * 10;
                tensInAmount = usd10InAtm;
            }
            System.out.println("Банкнот номиналом 100 USD: " + hundredsInAmount);
            System.out.println("Банкнот номиналом 10 USD: " + tensInAmount);
            System.out.println("Банкнот номиналом 1 USD: " + onesInAmount);
        }
    }
}
