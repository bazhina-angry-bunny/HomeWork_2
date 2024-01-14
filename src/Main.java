public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int a = 1200;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 3;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 230;
        System.out.println("Значение переменной s с типом short равно " + s);
        long r = 458L;
        System.out.println("Значение переменной r с типом long равно " + r);
        float f = 47.1646854486948f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 20415;
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();
        System.out.println("Задача 2");
        float pink = 27.12f;
        System.out.println(pink);
        long blue = 987678965549L;
        System.out.println(blue);
        float red = (float)2.786;
        System.out.println(red);
        short purple = 569;
        System.out.println(purple);
        short orange = -159;
        System.out.println(orange);
        int white = 27897;
        System.out.println(white);
        byte black = 67;
        System.out.println(black);
        System.out.println();
        System.out.println("Задача 3");
        int luda = 23;
        System.out.println("У Людмилы Павловны — " + luda+ " ученика,");
        int anna = 27;
        System.out.println("у Анны Сергеевны — " + anna+ " учеников?");
        int katya = 30;
        System.out.println("У Екатерины Андреевны — " + katya+ " ученика.");
        int totalNumberOfStudents = (luda + anna + katya);
        System.out.println("Всего " + totalNumberOfStudents + " учеников");
        int addSheetsPaper = 480;
        System.out.println("Закуплено " + addSheetsPaper + " листов бумаги на все три класса");
        int paperOneStudent = (addSheetsPaper/totalNumberOfStudents);
        System.out.println("На каждого ученика рассчитано по " + paperOneStudent + " листов бумаги.");
        System.out.println();
        System.out.println("Задача 4");
        int fabricated1Minute = 16 / 2;
        System.out.println("Средняя производительность машины равна " + fabricated1Minute + " бутылок в 1 минуту");
        int timePeriodOfOneInMinutes = 20;
        int timePeriodOfSecondInMinutes = 24 * 60;
        int timePeriodOfThreeInMinutes = 3 * timePeriodOfSecondInMinutes;
        int timePeriodOfFourInMinutes = 30 * timePeriodOfSecondInMinutes;
        int fabricated20Minutes = fabricated1Minute * timePeriodOfOneInMinutes;
        System.out.println("За 20 минут машина произвела " + fabricated20Minutes +" штук бутылок,");
        int fabricated1Days = timePeriodOfSecondInMinutes * fabricated1Minute;
        System.out.println("За 1 день машина произвела " + fabricated1Days +" штук бутылок,");
        int fabricated3Days = timePeriodOfThreeInMinutes * fabricated1Minute;
        System.out.println("За 3 дня машина произвела " + fabricated3Days +" штук бутылок,");
        int fabricated30Days = timePeriodOfFourInMinutes * fabricated1Minute;
        System.out.println("За 1 месяц машина произвела " + fabricated30Days +" штук бутылок,");
        System.out.println();
        System.out.println("Задача 5");
        int cansOfWhitePaitInOneClass = 2;
        int cansOfBrownPaitInOneClass = 4;
        int totalCans = 120;
        int oneSetOfCans = (cansOfWhitePaitInOneClass + cansOfBrownPaitInOneClass);
        int numberClass = (totalCans / oneSetOfCans);
        int totalWhiteCans = (numberClass * cansOfWhitePaitInOneClass);
        int totalBrownCans = (numberClass * cansOfBrownPaitInOneClass);
        System.out.println("В школе, где " + numberClass+" классов, нужно " + totalWhiteCans+" банок белой краски и " + totalBrownCans+ " банок коричневой краски.");
        System.out.println();
        System.out.println("Задача 6");
        int bananaWeigthInGramms = 80;
        int milkWeigthInGramms = 105;
        int iceCreamWeigthInGramms = 100;
        int eggWeigthInGramms = 70;
        int bananaPieces = 5;
        int milkPieces = 2;
        int iceCreamPieces = 2;
        int eggPieces = 4;
        int BananaWeightForAServing = bananaPieces * bananaWeigthInGramms;
        int milkWeightForAServing = milkPieces * milkWeigthInGramms;
        int iceCreamWeightForAServing = iceCreamPieces * iceCreamWeigthInGramms;
        int eggWeightForAServing = eggPieces * eggWeigthInGramms;
        int portionWeightInGramm = BananaWeightForAServing + milkWeightForAServing + iceCreamWeightForAServing + eggWeightForAServing;
        double gramToKilogram = 1000;
        double portionWeightInKilogramm = portionWeightInGramm / gramToKilogram;
        System.out.println("Вес спортивного завтрака составляет " + portionWeightInGramm+ " грамм, что соответствует " + portionWeightInKilogramm+ " килограмма.");
        System.out.println();
        System.out.println("Задача 7");
        int slowWeightLossKg = (int) (7/(250/1000f));
        System.out.println("Количество дней при медленном похудении составит " + slowWeightLossKg+ " дней,");
        int quickWeightLossKg = (int) (7/(500/1000f));
        System.out.println("Количество дней при более быстром похудении составит " + quickWeightLossKg+ " дней,");
        int denominatorToFindTheAverageValue = 2;
        int averageNumberOfActions = (slowWeightLossKg + quickWeightLossKg) / denominatorToFindTheAverageValue;
        System.out.println("В среднем потребуется " + averageNumberOfActions+ " день, чтобы добиться желаемого результата.");
        System.out.println();
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int numberOfMonthsInAYear = 12;
        int percentageOfChangeInPay = 10;
        double denominator = 100;
        double newSalaryMashaInMonth = (salaryMasha + (percentageOfChangeInPay * (percentageOfChangeInPay * salaryMasha) / denominator));
        double newPerYearSalaryMasha = numberOfMonthsInAYear * (newSalaryMashaInMonth - salaryMasha);
        System.out.println("Теперь Маша получает " + newSalaryMashaInMonth+ " рублей в месяц. Годовой доход вырос на " + newPerYearSalaryMasha+ " рублей,");
        double newSalaryDenisInMonth = (salaryDenis + ((percentageOfChangeInPay * salaryDenis) / denominator));
        double newPerYearSalaryDenis = numberOfMonthsInAYear * (newSalaryDenisInMonth - salaryDenis);
        System.out.println("Теперь Денис получает " + newSalaryDenisInMonth+ " рублей в месяц. Годовой доход вырос на " + newPerYearSalaryDenis+ " рублей,");
        double newSalaryKristinaInMonth = (salaryKristina + ((percentageOfChangeInPay * salaryKristina) / denominator));
        double newPerYearSalaryKristina = numberOfMonthsInAYear * (newSalaryKristinaInMonth - salaryKristina);
        System.out.println("Теперь Кристина получает " + newSalaryKristinaInMonth+ " рублей в месяц. Годовой доход вырос на " + newPerYearSalaryKristina+ " рублей.");
    }
}