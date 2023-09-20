package hw4;

public class ElementAvg {
    public static void main(String[] args) {

        ElementAvg elementAvg = new ElementAvg();

        int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

        elementAvg.countAverge(arr);
    }

    public void countAverge(int[] arr) {//計算陣列的平均值並輸出大於平均值的元素

        double avg, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / arr.length;
        System.out.println("平均值為:" + avg);
        System.out.println("大於平均值的數字為:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
