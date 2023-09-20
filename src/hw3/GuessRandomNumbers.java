package hw3;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumbers {
    public static void main(String[] args) {
        GuessRandomNumbers guessRandomNumbers = new GuessRandomNumbers();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("猜數字:");
        int guessNumber = scanner.nextInt();

        int randomNumber = random.nextInt(101);//產生0到100的亂數
        guessRandomNumbers.guessNum(guessNumber, randomNumber);//傳入猜測數字和已產生的目標亂數，使用"物件"調用方法
    }
    public void guessNum(int guessNumber, int randomNumber){
        Scanner scanner = new Scanner(System.in);

        while (guessNumber != randomNumber){

            if(guessNumber > randomNumber){
                System.out.println("猜測數字大於正確答案");
            }else {
                System.out.println("猜測數字小於正確答案");
            }
            System.out.println("猜錯了，再猜一次吧");
            guessNumber = scanner.nextInt();
        }
        System.out.println("答對了，答案是:" + randomNumber);
    }
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("猜數字:");
//        int guessNumber = input.nextInt();
//        int randomNumber = random.nextInt(10);
//
//        while (guessNumber != randomNumber){
//            System.out.println("猜錯了，再猜一次吧");
//            guessNumber = input.nextInt();
//        }
//        System.out.println("答對了，答案是:" + randomNumber);
//        input.close();
//    }
}
