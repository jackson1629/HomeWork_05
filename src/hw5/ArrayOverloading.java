package hw5;

import static java.lang.Integer.MIN_VALUE;

public class ArrayOverloading {
    public static int maxElement(int x[][]){

        int max = MIN_VALUE;

        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++) {
                while (x[i][j] > max){
                    max = x[i][j];
                }
            }
        }
        return max;
    }
    public static double maxElement(double x[][]){

        double max = MIN_VALUE;

        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x[i].length; j++) {
                while (x[i][j] > max){
                    max = x[i][j];
                }
            }
        }
        return max;
    }
}
