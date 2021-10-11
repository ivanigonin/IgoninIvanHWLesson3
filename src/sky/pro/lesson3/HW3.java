package sky.pro.lesson3;

public class HW3 {
    public static void main(String[] args) {
        //Задача 1
        byte a = 127;
        short b = 32_767;
        int c = 32_768;
        long d = 22_222_222_222L;
        float e = 3.76f;
        double f = 3.77777777;
        //Задача 2
        float sportsman1 = 78.2f;
        float sportsman2 = 82.7f;
        float boathWeight = sportsman1 + sportsman2;
        float leftWeight = sportsman2 - sportsman1;
        System.out.println("Задача №2");
        System.out.println("Вес двух боксеров равен " + boathWeight + " кг");
        System.out.println("Разница в весе двух боксеров равна " + leftWeight + " кг");
        // Задача 3
        int numberBananas = 5;
        int numberMilk = 2;
        int numberIceCreams = 2;
        int numberEggs = 4;
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int totalBananasWeight = numberBananas * weightBanana;
        int totalMilkWeight = numberMilk * weightMilk;
        int totalIceCreamsWeight = numberIceCreams * weightIceCream;
        int totalEggsWeight = numberEggs * weightEgg;
        int totalBreakFastWeight = totalBananasWeight + totalMilkWeight + totalIceCreamsWeight + totalEggsWeight;
        System.out.println("Задача №3");
        System.out.println("Вес спорт-завтрака равен " + totalBreakFastWeight + " Граммов");
        float gToKg = 1_000f;
        float convertToKg = totalBreakFastWeight / gToKg;
        System.out.println("Вес спорт-завтрака равен " + convertToKg + " Килограммов");
        //Задача 4
        int needLeftWeight = 7;
        int kgToG = 1000;
        int convertToG = needLeftWeight * kgToG;
        int perDay1 = 250;
        int perDay2 = 500;
        int leftDays1 = convertToG / perDay1;
        int leftDays2 = convertToG / perDay2;
        System.out.println("Задача №4");
        System.out.println(leftDays1 + " - Дней необходимо если спортсмен будет худеть на 250 грамм в день; " + leftDays2 + " - Дней необходимо если спортсмен будет худеть на 500 грамм в день");
        int midDays = (leftDays1 + leftDays2) / 2;
        System.out.println(midDays + " - В среднем дней необходимо чтобы сбросить спортсмену 7 килограммов");
        //Задача 5
        int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        float upSalaryMaria = salaryMaria / 100f * 10;
        float upSalaryDenis = salaryDenis / 100f * 10;
        float upSalaryKristina = salaryKristina / 100f * 10;
        float totalSalaryMaria = salaryMaria + upSalaryMaria;
        float totalSalaryDenis = salaryDenis + upSalaryDenis;
        float totalSalaryKristina = salaryKristina + upSalaryKristina;
        float upSalaryForYearMaria = (totalSalaryMaria - salaryMaria) * 12;
        float upSalaryForYearDenis = (totalSalaryDenis - salaryDenis) * 12;
        float upSalaryForYearKristina = (totalSalaryKristina - salaryKristina) * 12;
        System.out.println("Задача №5");
        System.out.println("Мария получает теперь в месяц, после повышения ЗП на 10% = " + totalSalaryMaria + "; Годовой доход вырос на " + upSalaryForYearMaria + " рублей.");
        System.out.println("Денис получает теперь в месяц, после повышения ЗП на 10% = " + totalSalaryDenis + "; Годовой доход вырос на " + upSalaryForYearDenis + " рублей.");
        System.out.println("Кристины получает теперь в месяц, после повышения ЗП на 10% = " + totalSalaryKristina + "; Годовой доход вырос на " + upSalaryForYearKristina + " рублей.");
    }
}
