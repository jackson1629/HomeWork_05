package hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateRandomData {
    public static void main(String[] args) {

        Random random = new Random();

        try {
//            String fileName = "Data.txt";
//            File file = new File(fileName);
//            FileWriter fw = new FileWriter(file,true);
//            BufferedWriter bw = new BufferedWriter(fw);

            BufferedWriter bw = new BufferedWriter(new FileWriter("Data.txt", true));//簡化寫法

            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(1000) + 1;
                bw.write(Integer.toString(randomNumber));//把數字轉為字串，寫入緩衝區物件
                bw.write("\t");//排版
            }

            bw.newLine();//換行
            System.out.println("成功生成并寫入 Data.txt 文件");
//            bw.close();
//            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
