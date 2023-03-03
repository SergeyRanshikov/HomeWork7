public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;

        while ( total < 2_459_000) {

            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;

        while ( i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        } {
            System.out.println(" ");
        }
        for (int j = 10; j > 0; j = j - 1) {
            System.out.print(j + " ");
        }{
            System.out.println(" ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int populationOfTheCountryY = 12_000_000;
        int dies = 8;
        int born = 17;
        int difference = born - dies;

        for (int l = 1; l < 11; l = l + 1) {
            populationOfTheCountryY += populationOfTheCountryY * difference/1000;
            System.out.println("Год " + l + " численность населения составляет " + populationOfTheCountryY);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int depositAmount = 15000;
        int monthlyInterest = 7;
        int i = 1;

        for ( ; depositAmount < 2000000; i = i + 1) {
            depositAmount += depositAmount*monthlyInterest/100;

            System.out.println("После "  + i + " месяца сумма накоплений составит " + depositAmount + " рублей");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int depositAmount = 15000;
        int monthlyInterest = 7;
        int i = 1;

        for ( ; depositAmount < 2000000; i = i + 1) {
            depositAmount += depositAmount * monthlyInterest / 100;
            if (i % 6 == 0) {
                System.out.println("После " + i + " месяца сумма накоплений составит " + depositAmount + " рублей");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int depositAmount = 15000;
        int monthlyInterest = 7;
        int depositTermMonths = 9 * 12 + 1;

        for (int i = 1; i < depositTermMonths; i = i + 1) {
            depositAmount += depositAmount * monthlyInterest / 100;
            if (i % 6 == 0) {
                System.out.println("После " + i + " месяца сумма накоплений составит " + depositAmount + " рублей");
            }
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
            int totalDays = 31;
            int i = 3;
            for ( ; i < totalDays; i = i + 7) {
                System.out.println("Сегодня пятница, " + i + "-e число. Необходимо подготовить отчет!");
            }
    }

    public static void task8 () {
        System.out.println("Задача 8");
            int totalYears = 2023 + 100;
            int i = 1896;
            for ( ; i < totalYears; i = i + 79) {
                System.out.println(i);
            }
    }
}


