package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {

            System.out.println("請輸入底數 x :");
            if (scanner.hasNextInt()) {//判斷x是否為整數
                int x = scanner.nextInt();
                System.out.println("請輸入次方數 y :");
                if (scanner.hasNextInt()) {//判斷y是否為整數
                    int y = scanner.nextInt();
                    System.out.println(x + " 的 " + y + " 次方 = " + calculator.powerXY(x, y));
                } else {
                    throw new CalException("輸入格式不正確");//判斷y是否為整數，不是則丟出例外
                }
            } else {
                throw new CalException("輸入格式不正確");//判斷x是否為整數，不是則丟出例外
            }
            scanner.close();

        } catch (CalException e) {
            System.out.println(e.getMessage());//自定義異常
        } catch (Exception e) {
            throw new RuntimeException(e);//java預設RuntimeException不是必須處理的例外，不需要用throws拋出例外
            //throw e;//如果是這樣寫，Main方法就要拋出例外throws Exception
        }
    }
}
