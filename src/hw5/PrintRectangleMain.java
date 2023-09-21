package hw5;

import java.util.Scanner;

public class PrintRectangleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width, height;

        System.out.println("請輸入寬與高(EX:5 4):");
        width = scanner.nextInt();
        height = scanner.nextInt();

        PrintRectangle.starSquare(width, height);//使用類別PrintRectangle呼叫starSquare
    }
}
