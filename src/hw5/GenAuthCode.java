package hw5;

import java.util.Random;

public class GenAuthCode {
    public static String genAuthCode() {

        StringBuilder stringBuilder = new StringBuilder();
        Random randomNumber = new Random();

        String charArray = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < 8; i++){
            stringBuilder.append(charArray.charAt(randomNumber.nextInt(charArray.length())));
        }//charAt(index) : 字串中的第 index 字元。也就是把產生的亂數作為字元陣列的索引值，加入"字串處理物件"裡面

        return stringBuilder.toString();//轉為字串，回傳
    }
}
