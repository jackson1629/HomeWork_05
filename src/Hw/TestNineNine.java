package Hw;

public class TestNineNine {
    public static void main(String[] args) {
        System.out.println("第一種:");
        for (int i = 1; i <= 9; i++) {
            int j = 1;
            System.out.println();

            while (j <= 9) {
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            }
        }

        System.out.println("第二種:");
        for (int i = 1; i <= 9; i++) {
            int j = 1;
            System.out.println();

            do {
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            } while (j <= 9);
        }

        System.out.println("第三種:");
        int i = 0;
        while (i < 9) {
            i++;
            int j = 1;
            System.out.println();

            do {
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            } while (j <= 9);
        }
    }
}
