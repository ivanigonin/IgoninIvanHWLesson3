package sky.pro.lesson3;

import java.util.Arrays;

public class HW8_Methods {

    // Задача №1
    public static void printTellTrueYear(int year) {
        boolean trueYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        printTellTrueYear(year, trueYear);
    }
    private static void printTellTrueYear(int year, boolean trueYear) {
        if (trueYear) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
    // Задача №2
    public static void printOSApplication(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию Android приложения");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите упрощенную версию Android приложения");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию iOS приложения");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите упрощенную версию iOS приложения");
    }
    // Задача №3
    public static int printDeliveryDays(int deliveryDistance) {
        int day = 1;
        boolean dayPerDistance1 = deliveryDistance < 20;
        boolean dayPerDistance2 = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean dayPerDistance3 = deliveryDistance >= 60 && deliveryDistance < 100;
        if (dayPerDistance1) {
            System.out.println("Потребуется " + day + " день на доставку");
        } else if (dayPerDistance2) {
            System.out.println("Потребуется " + (day + 1) + " дня на доставку");
        } else if (dayPerDistance3) {
            System.out.println("Потребуется " + (day + 2) + " дня на доставку");
        } else
            System.out.println("Доставка рассчитываеется через оператора компании");
        return day;
    }
    // Задача №4
    public static void printNoDoubles(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Есть дублирование слудющего симовла - " + letter);
            return;
        }
        prevChar = letter;
    }
        System.out.println("Нет дублирования");
    }
    // Задача №5
    public static void change(int[] massiv) {
        int beginning = 0;
        int fin = massiv.length - 1;
        while (beginning < fin) {
            int temp = massiv[beginning];
            massiv[beginning++] = massiv[fin];
            massiv[fin--] = temp;
        }
    }

    public static void main(String[] args) {
        //Задача 1, Является ли год високосным?
        System.out.println("Задача №1");
        printTellTrueYear(2021);
        //Задача 2, Предложить пользователю облегченную версию приложения.
        System.out.println("Задача №2");
        printOSApplication(1, 2015);
        //Задача 3, Расчет дней доставки банковской карты от банка.
        System.out.println("Задача №3");
        printDeliveryDays(65);
        //Задача 4, Валидатор текста.
        System.out.println("Задача №4");
        printNoDoubles("aabccddefgghiijjkk");
        //Задача 5, Метод, который получает на вход массив и переставляет все его элементы в обратном порядке.
        System.out.println("Задача №5");
        int[] mass = {3, 2, 1, 6, 5};
        change(mass);
        System.out.println(Arrays.toString(mass));

    }
}
