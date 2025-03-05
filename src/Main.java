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
        for (y =10; y>0; y--){
            System.out.print(y+" ");
        }
        System.out.println();
        //задание №3
        int population = 12000000;
        int increase = population / 1000*(17-8);
        for (i=0; i<10; i++){
            population = population + increase;
            System.out.println("Год "+(i+1)+", численность населения состовляет "+ population);
        }
    }
}

