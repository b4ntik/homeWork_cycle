public class Main {
    public static void main(String[] args) {
        //задание №1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //задание №2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //задание №3
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        //задание №4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //задание №5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        //задание №6
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        //задание №7
        for (int i = 1; i < 1024; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //задание №8
        int total = 0;
        int sum = 29000;
        for (int i = 0; i < 12; i++) {
            total = total + sum;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + total + " рублей");
        }
        //задание №9
        double deposit = 0;
        for (int i = 0; i < 12; i++) {
            deposit = deposit + sum + 0.12 * deposit;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + Math.round(deposit * 100.0) / 100.0 + " рублей");
        }
        //задание №10
        int res;
        for (int i = 0; i < 10; i++) {
            res = 2 * (i + 1);
            System.out.println(2 + "*" + (i + 1) + "=" + res);
        }
    }
}
