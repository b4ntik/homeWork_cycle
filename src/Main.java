import java.text.DecimalFormat;
import java.time.Year;


public class Main {
    public static void main(String[] args) {
        //задание №1
        int target = 0;
        int i = 0;
        while (target < 2459000) {
            target = target + 15000;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + target + " рублей");

        //задание №2
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(y + " ");
        }
        System.out.println();
        for (y = 10; y > 0; y--) {
            System.out.print(y + " ");
        }
        System.out.println();
        //задание №3
        int population = 12000000;
        int increase = population / 1000 * (17 - 8);//увеличения численности в пересчете на всё население страны
        for (i = 0; i < 10; i++) {
            population = population + increase;
            increase = population / 1000 * (17 - 8);
            System.out.println("Год " + (i + 1) + ", численность населения составляет " + population);
        }
        //задание №4
        double deposit = 15000;
        int monthNumber = 0;
        DecimalFormat df = new DecimalFormat("#.##");//привожу накопления к общечеловеческому виду с двумя знаками после запятой
        df.setMaximumFractionDigits(2);
        while (deposit < 12_000_000) {
            monthNumber++;
            deposit = deposit + deposit * 0.07;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений " + df.format(deposit) + " рублей");
        }
        System.out.println("Для того, чтобы накопить 12 миллионов, Василию потребуется " + monthNumber + " месяцев");
        //задание №5
        deposit = 15000;
        monthNumber = 0;
        while (deposit < 12_000_000) {
            monthNumber++;
            deposit = deposit + deposit * 0.07;
            if (monthNumber % 6 == 0) {
                System.out.println("Накопления за " + monthNumber + " месяцев равны " + df.format(deposit));
            }
        }
        //задание №6
        deposit = 15000;//просто привожу уже созданные переменные к изначальным значениям
        monthNumber = 0;
        while (monthNumber < 9 * 12) {
            monthNumber++;
            deposit = deposit + deposit * 0.07;
            if (monthNumber % 6 == 0) { //проверка деления на 6
                System.out.println("Накопления за " + monthNumber + " месяцев равны " + df.format(deposit));
            }
        }
        //задание №7
        int firstFriday = 2;
        while (firstFriday < 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
        }
        //задание №8
        int yearAppearance = 0; //год первого появления кометы
        int currentYear = Year.now().getValue();//беру текущий год
        while (yearAppearance < (currentYear + 100)) {
            yearAppearance = yearAppearance + 79;
            if (yearAppearance > (currentYear - 200) && yearAppearance < (currentYear + 100)) {
                System.out.println(yearAppearance);
            }
        }
    }
}

