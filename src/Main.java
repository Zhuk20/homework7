public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        task1();
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        task2();
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        task3();
        System.out.println();
        System.out.println("Задание 4");
        System.out.println();
        task4();
        System.out.println();
        System.out.println("Задание 5");
        System.out.println();
        task5();
        System.out.println();
        System.out.println("Задание 6");
        System.out.println();
        task6();
        System.out.println();
        System.out.println("Задание 7");
        System.out.println();
        task7();
        System.out.println();
        System.out.println("Задание 8");
        System.out.println();
        task8();
    }

    private static void task8() {
        int currentYear = 2023;
        int minYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (int i = 79; i <= nextYear; i += 79) {
            if (i < minYear) {
                continue;
            }
            System.out.println(i + " в этот год пролетала комета");
        }
    }

    private static void task7() {
        int friday = 5;
        int day = 0;
        while (day <= 31) {
            if (day == friday) {
                friday += 7;
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
            day++;
        }
    }

    private static void task6() {
        double initialContribution = 15000d;
        int total = 0;
        int countYear = 0;
        while (initialContribution < 12_000_000) {
            initialContribution = initialContribution + (initialContribution * 0.07);
            total++;
            if (total % 6 == 0) {
                System.out.println("Месяц " + total + " Сумма накоплений " + initialContribution);
            }
            if (total % 12 == 0) {
                countYear++;
            }
            if (countYear == 9) {
                break;
            }
        }
    }

    private static void task5() {
        double initialContribution = 15000d;
        int total = 0;
        while (initialContribution < 12_000_000) {
            initialContribution = initialContribution + (initialContribution * 0.07);
            total++;
            if (total % 6 == 0) {
                System.out.println("Месяц " + total + " Сумма накоплений " + initialContribution);
            }
        }
    }

    private static void task4() {
        double initialContribution = 15000d;
        int total = 0;
        while (initialContribution < 12_000_000) {
            initialContribution = initialContribution + (initialContribution * 0.07);
            total++;
            System.out.println("Месяц " + total + " Сумма накоплений " + initialContribution);
        }
    }

    private static void task3() {
        int countryY = 12_000_000;
        int birth = 17;
        int mortality = 8;
        int birthrateYear = birth - mortality;
        int birthrate;
        System.out.println("Год 0 численность населения составляет " + countryY);
        for (int i = 1; i <= 10; i++) {
            birthrate = (countryY / 1000) * birthrateYear;
            countryY += birthrate;
            System.out.println("Год " + i + " численность населения составляет " + countryY);
        }
    }

    private static void task2() {
        int total = 1;
        while (total <= 10) {
            System.out.print(total + " ");
            total += 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    private static void task1() {
        int salary = 0;
        int total = 0;
        while (salary < 2_459_000) {
            salary += 15000;
            total += 1;
        }
        System.out.println("Месяц " + total + ", сумма накоплений равна " + salary + " рублей");
    }
}