package Hw3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入阿文不想要的數字:");
        int dislikeNumber = input.nextInt();

        lottery.countAndPrint(dislikeNumber);
    }
    public void countAndPrint(int number){
        int count = 0;

        for (int i = 1; i <= 49; i++) {
            if (i % 10 != number && i / 10 != number) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n一共有" + count + "個數字可以選");
    }
}
