package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteAnimalObjectMethod {
    public static void writeAnimalObject(List<Animal> animal, File file) {
        ObjectOutputStream objectOutputStream = null;

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(file);//序列化後的物件即可輸出並持久化
            objectOutputStream = new ObjectOutputStream(fileOutputStream);//將物件序列化

            for (int i = 0; i < animal.size(); i++) {
                objectOutputStream.writeObject(animal.get(i));//從ArrayList一個一個取出物件並寫入
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(objectOutputStream != null){//ObjectOutputStream為源頭，關閉這個FileOutputStream也同樣關閉了。
                    objectOutputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
