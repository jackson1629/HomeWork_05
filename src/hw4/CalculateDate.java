package hw4;

import java.util.Scanner;

public class CalculateDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculateDate calculateDate = new CalculateDate();

        int year, month, day;

        System.out.println("請輸入年 月 日(EX:1984 9 8):");
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();

        if (calculateDate.isValidDate(year, month, day)) {
            int totalDay = calculateDate.calculateDayOfYear(year, month, day);
            System.out.println("輸入的日期為該年第" + totalDay + "天");
        }else {
            System.out.println("該日期為無效輸入");
        }

    }

    public Boolean isValidDate(int year, int month, int day) {//判斷輸入是否為有效日期

        if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        } else {

            int[] dayInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//把一年的各月天數放入陣列

            if (checkLeapYear(year)) {
                dayInMonth[2] = 29;//如果為閏年，2月加1天
            }

            return day <= dayInMonth[month];//如果小於等於當月天數，回傳True
        }
    }
    public Boolean checkLeapYear(int year) {//判斷閏年，是4和400的倍數，減去100的倍數的年份皆為閏年
        return  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public int calculateDayOfYear(int year, int month, int day){//計算輸入日期為該年第幾天

        int totalDay = 0;
        int [] dayInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (checkLeapYear(year)) {
            dayInMonth[2] = 29;//如果為閏年，2月加1天
        }

        for (int i = 0; i < month; i++) {//將當月之前月份的天數進行加總
            totalDay += dayInMonth[i];
        }

        return totalDay += day;//回傳當月之前的總天數 + 當月的天數
    }
}
