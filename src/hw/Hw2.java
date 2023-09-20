package hw;

public class Hw2 {
    public static void main(String[] args) {
        System.out.println("第一題:");
        int sum1 = 0;

        for (int i = 0; i <= 1000; i += 2) {
            sum1 += i;
        }
        System.out.println("1~1000的偶數和為:" + sum1);
        System.out.println();

        System.out.println("第二題:");
        int sum2 = 1;
        for (int i = 1; i <= 10; i++) {
            sum2 *= i;
        }
        System.out.println("1~10的連乘積為:" + sum2);
        System.out.println();

        System.out.println("第三題:");
        int sum3 = 1;
        int z = 1;
        while (z < 11) {
            sum3 *= z;
            z++;
        }
        System.out.println("1~10的連乘積為:" + sum3);
        System.out.println();

        System.out.println("第四題:");
        for (int i = 1; i < 11; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
        System.out.println("\n");

        System.out.println("第五題:");
        int count = 0;
        for (int i = 1; i <= 49; i++) {
            if (i % 10 == 4 || i / 10 == 4){
                continue;
            }
            System.out.print(i + " ");
            count++;
            /*
            if (i % 10 != 4 && i / 10 != 4) {
                System.out.print(i + " ");
                count++;
            }
            */
        }
        System.out.println("\n一共有" + count + "個");
        System.out.println();

        System.out.println("第六題:");
        for (int i = 10; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("第七題:");
        for (char c = 'A'; c <= 'F'; c++){
            for (int i = 1; i <= c-'A'+1; i++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}