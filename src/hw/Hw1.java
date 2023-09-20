package hw;

import static java.lang.Math.pow;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("第一題:");
        System.out.println("12+6=" + (12 + 6));
        System.out.println("12*6=" + 12 * 6);


        System.out.println("\n第二題:");
        System.out.println("200顆蛋一共是" + 200 / 12 + "打" + 200 % 12 + "顆");

        System.out.println("\n第三題:");
        int day, hour, minute, second;

        int secondsInMinute = 60;
        int secondsInHour = 60 * secondsInMinute;
        int secondsInDay = 24 * secondsInHour;

        int secondsNumber = 256559;
        day = secondsNumber / secondsInDay;
        int remainSeconds = secondsNumber % secondsInDay;

        hour = remainSeconds / secondsInHour;
        remainSeconds %= secondsInHour;

        minute = remainSeconds / secondsInMinute;
        remainSeconds %= secondsInMinute;

        second = remainSeconds;

        System.out.println("256559秒等同於 " + day + "天 " + hour + "小時 " + minute + "分 " + second + "秒");

        System.out.println("\n第四題:");
        final double PI = 3.1415;
        int rad = 5;
        System.out.println("半徑為5的圓面積為:" + PI * pow(rad, 2));
        System.out.println("半徑為5的圓周長為:" + 2 * PI * rad);

        System.out.println("\n第五題:");
        double capital = 1_500_000;
        double interestRate = 0.02;
        double total;
        total = capital * pow(1 + interestRate, 10);
        System.out.println("本金為150萬，年利率為2%，10年後本金加利息為:" + total + "元");

        System.out.println("\n第六題:");
        System.out.println(5 + 5);//數字5+5=10
        System.out.println(5 + '5');//字元5會轉為ASCII的編碼53，和5相加後為58
        System.out.println(5 + "5");//數字5和字串5做拼接，結果為55

    }
}