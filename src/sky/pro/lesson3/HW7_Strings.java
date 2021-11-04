package sky.pro.lesson3;

public class HW7_Strings {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        //Задача 2
        System.out.println("Задача №2");
        String fullName = "Ivanov Ivan Ivanovich";
        String mainFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + mainFullName);
    }

    public static void task3() {
        //Задача 3
        System.out.println("Задача №3");
        String fullName = "Ivanov Ivan Ivanovich";
        String anotherFullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + anotherFullName);
    }

    public static void task4() {
        //Задача 4
        System.out.println("Задача №4");
        String fullName = "Иванов Семён Семёнович";
        String correctFullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + correctFullName);
    }
}
