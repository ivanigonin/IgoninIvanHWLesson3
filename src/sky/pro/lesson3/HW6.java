package sky.pro.lesson3;


public class HW6 {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();

        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            summ += val;
        }

        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");

    }

    public static void task2() {
        //Задача 2
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minimal = arr[0];
        int maximum = arr[29];

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            if (val < minimal) {
                minimal = val;
            } else if (val > maximum) {
                maximum = val;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minimal + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей");
    }

    public static void task3() {
        //Задача 3
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float summ = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            summ += val;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (summ / arr.length) + " рублей");
    }

    public static void task4() {
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}