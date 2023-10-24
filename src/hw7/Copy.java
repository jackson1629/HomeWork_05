package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {

        Copy copy = new Copy();

        String source = "Data.txt";
        String destination = "destination.txt";

        copy.CopyFile(source, destination);
    }

    public void CopyFile(String source, String destination) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            fileInputStream = new FileInputStream(source);
            fileOutputStream = new FileOutputStream(destination);

            byte[] bt = new byte[1024];//一次讀取1024bit
            int readByte;

            while ((readByte = fileInputStream.read(bt)) != -1) {
                fileOutputStream.write(bt, 0, readByte);
            }
            fileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
