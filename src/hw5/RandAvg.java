package hw5;

import java.util.Random;

public class RandAvg {
    public static void randAvg() {

        Random random = new Random();

        int total = 0;

        System.out.println("本次亂數結果:");
        for (int i = 0; i < 10; i++) {

            int randomNumber = random.nextInt(101);
            System.out.print(randomNumber + " ");
            total += randomNumber;

        }
        System.out.println("\n平均值為:" + total / 10);
    }
}