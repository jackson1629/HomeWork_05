package hw7;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateObjects {
    public static void main(String[] args) {

        List<Animal> animal = new ArrayList<>();//有了繼承關係，可以使用多型操作，收集不同型別的子類別物件，進行統一的操作
        animal.add(new Dog("二哈"));
        animal.add(new Dog("坤坤"));
        animal.add(new Cat("小麥"));
        animal.add(new Cat("小緣"));

        File file = new File("data/Object.ser");
        if (!file.getParentFile().exists()) {//getParentFile()的作用為避免其文件所在的 文件夾 不存在，然後拋出異常，這裡的文件指的是data
            file.getParentFile().mkdir();
        }
        WriteAnimalObjectMethod.writeAnimalObject(animal, file);//WriteAnimalObject類別調用靜態方法writeAnimalObject
    }
}
