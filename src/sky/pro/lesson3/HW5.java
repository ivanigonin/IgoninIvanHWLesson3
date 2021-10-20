package sky.pro.lesson3;

public class HW5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
    }

    public static void task2() {
        //Задача 2
        System.out.println("Задача 2");
        int friday = 1;
        for (int f = friday; f <= 31; f += 7) {
        System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        //Задача 2
        System.out.println("Задача 3");
        int recentYear = 2021;
        int previosYear = recentYear - 200;
        int lastYear = recentYear + 100;
        for (int year = previosYear; year <= lastYear; year++) {
            if (year % 79 == 0)
            System.out.println(year);
        }
    }
}
