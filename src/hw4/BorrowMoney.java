package hw4;

import java.util.Scanner;

public class BorrowMoney {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BorrowMoney borrowMoney = new BorrowMoney();

        System.out.print("請輸入欲借的金額：");
        int borrow = scanner.nextInt();

        borrowMoney.canBorrow(borrow);

    }

    public void canBorrow(int borrow) {

        StringBuilder empNumber = new StringBuilder();//創建"字串處理物件"

        int[][] employees = {
                {25, 2500},
                {32, 800},
                {8, 500},
                {19, 1000},
                {27, 1200}
        };
        int count = 0;

        for (int[] emp : employees) {//利用迭代器遍歷每個元素

            int empNo = emp[0];//員工編號
            int empCash = emp[1];//對應的可借金額

            if (empCash > borrow) {
                empNumber.append(empNo).append(" ");//拼接員工編號，把編號一一放入字串處理物件中
                count++;
            }
        }
        System.out.println("有錢可借的員工編號: " + empNumber.toString() + "共 " + count + " 人!");
    }
}
