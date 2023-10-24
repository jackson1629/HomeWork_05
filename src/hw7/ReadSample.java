package hw7;

import java.io.*;

public class ReadSample {
    public static void main(String[] args) throws FileNotFoundException {

        int countByte = 0;
        int countChar = 0;
        int countData = 0;

        String fileName = "Sample.txt";//要讀取的文件名稱
        File file = new File(fileName);//創立"文件"的物件
        FileReader fr = new FileReader(file);//創立"讀取字元文件"的物件
        BufferedReader br = new BufferedReader(fr);//創立"讀取字元文件"的緩衝區物件，提高讀取效率

        try {
            String line;
            while ((line = br.readLine()) != null) {//判斷讀取字元是否為空
                countByte += line.getBytes().length;
                countChar += line.length();
                countData++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();//關閉緩衝區物件
                if (fr != null)
                    fr.close();//關閉"讀取字元文件"的物件
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(fileName + "檔案共有" + countByte + "個位元組," + countChar + "個字元," + countData + "列資料");
    }
}
