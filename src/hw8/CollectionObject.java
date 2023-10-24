package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class CollectionObject {
    public static void main(String[] args) {

        Collection<Object> collection = new ArrayList<>();

        collection.add(new Integer(100));
        collection.add(new Double(3.14));
        collection.add(new Long(21L));
        collection.add(new Short("100"));
        collection.add(new Double(5.1));
        collection.add("Kitty");
        collection.add(new Integer(100));
        collection.add(new Object());
        collection.add("Snoopy");
        collection.add(new java.math.BigInteger("1000"));


        System.out.println("使用 Iterator 印出所有元素:");
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n使用傳統 for 印出所有元素:");
        for (int i = 0; i < collection.size(); i++) {
            System.out.print(collection.toArray()[i] + " ");//把集合內的元素用toArray()轉為陣列
        }

        System.out.println("\n使用 foreach 印出所有元素:");
        for (Object element : collection) {//結構 : for (數組或集合中元素的類型 每次循環迭代時的一個元素 : 要遍歷的數組或集合)
            System.out.print(element + " ");
        }


        iterator = collection.iterator();//第一個循環結束後，迭代器 iterator 已經遍歷到了集合的末尾，要重新獲取一個新的迭代器
        while (iterator.hasNext()) {//如果沒有重新獲取一個新的迭代器，第二個循環中 iterator.hasNext() 的條件始終為 false
            Object obj = iterator.next();
            if (!(obj instanceof Number)){
                iterator.remove();
            }
        }

        System.out.println("\n移除非Number相關的物件後:");
        for(Object object : collection){
            System.out.print(object + " ");
        }
    }
}
