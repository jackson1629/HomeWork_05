package Hw3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);

        int x, y, z;
        System.out.println("請輸入三角形的三個邊:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        triangle.judgeTriangle(x, y, z);
    }
    public void judgeTriangle(int x, int y, int z){

        if (x + y > z && y + z > x && x + z > y) {
            if (x == y && y == z) {
                System.out.println("正三角形");
            } else if (x == y || y == z || x == z) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            System.out.println("這不是三角形");
        }
    }
}
