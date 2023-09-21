package hw5;

public class ArrayOverloadingMain {
    public static void main(String[] args) {

        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };

        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };

        System.out.println(ArrayOverloading.maxElement(intArray));
        System.out.println(ArrayOverloading.maxElement(doubleArray));
    }
}
