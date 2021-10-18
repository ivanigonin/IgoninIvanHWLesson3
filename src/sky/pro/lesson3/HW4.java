package sky.pro.lesson3;

public class HW4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        //Задача 2
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Утсановите актуальную версию Android приложения");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите упрощенную версию Android приложения");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию iOS приложения");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите упрощенную версию iOS приложения");
        else
            System.out.println("Данная версия ОС не поддерживается");
    }

    public static void task3() {
        //Задача 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else
        if (year % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (year % 4 == 0)
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");
    }

    public static void task4() {
        //Задача 4
        System.out.println("Задча 4");
        int deliveryDistance = 95;
        int day = 1;
        boolean dayPerDistance1 = deliveryDistance < 20;
        boolean dayPerDistance2 = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean dayPerDistance3 = deliveryDistance >= 60 && deliveryDistance < 100;
        if (dayPerDistance1) {
            System.out.println("Потребуется " + day + " день");
        } else if (dayPerDistance2) {
            System.out.println("Потребуется " + (day + 1) + " дня");
        } else if (dayPerDistance3) {
            System.out.println("Потребуется " + (day + 2) + " дня");
        } else
            System.out.println("Доставка рассчитываеется через оператора компании");
    }

    public static void task5() {
        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Номер месяца больше 12");
        }
    }

}