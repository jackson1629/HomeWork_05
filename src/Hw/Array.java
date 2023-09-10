package Hw;

import java.util.Random;

import static java.lang.Math.random;

public class Array {
    public static void main(String[] args) {
        //step1: create three 3x3 arrays
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];

        //step2:put random data to x array
        random(x);
        //step3:put random data to y array
        random(y);
        //step4:add x and y and put to z array
        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        //step5:print all array
        System.out.println("x:");
        printArray(x);
        System.out.println("y:");
        printArray(y);
        System.out.println("z:");
        printArray(z);
    }

    public static void random(int[][] number) {

        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = random.nextInt(31);
            }
        }
    }

    public static void printArray(int[][] number) {

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}