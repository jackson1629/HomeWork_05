package hw7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        File file = new File("data/Object.ser");

        ObjectInputStream objectInputStream = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            for (int i = 0; i < 4; i++) {
                animals.add((Animal) objectInputStream.readObject());//讀取物件皆為Object類型，須強制轉型，並加入Arraylist
            }
            for (Animal animal : animals) {
                animal.speak();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objectInputStream != null) {//ObjectInputStream為源頭，關閉這個FileInputStream也同樣關閉了。
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
