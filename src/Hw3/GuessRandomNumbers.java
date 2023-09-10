package Hw3;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("猜數字:");
        int guessNumber = input.nextInt();
        int randomNumber = random.nextInt(10);

        while (guessNumber != randomNumber){
            System.out.println("猜錯了，再猜一次吧");
            guessNumber = input.nextInt();
        }
        System.out.println("答對了，答案是:" + randomNumber);
        input.close();
    }
}
