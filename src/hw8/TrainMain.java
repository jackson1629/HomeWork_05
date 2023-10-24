package hw8;

import java.util.*;

public class TrainMain {
    public static void main(String[] args) {
        List<Train> trainList = new ArrayList<>();

        trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainList.add(new Train(118, "自強", "高雄", "台北", 500));
        trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));

        System.out.println("1.請寫一隻程式,能印出不重複的Train物件:");
        Set<Train> uniqueTrains = new HashSet<>(trainList);
//        for (Train train : uniqueTrains) {//for-each寫法
//            System.out.println(train);
//        }

        Iterator<Train> trainIterator = uniqueTrains.iterator();//iterator寫法
        while (trainIterator.hasNext()){
            System.out.println(trainIterator.next());
        }

        System.out.println("\n2.請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出:");
        Collections.sort(trainList);//把ArrayList做排序
//        for (Train train : trainList) {//for-each寫法
//            System.out.println(train);
//        }

//        Iterator<Train> iterator = trainList.iterator();//iterator寫法
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(int i = 0; i < trainList.size(); i++){//傳統for寫法。註:只有List可以用傳統for和iterator寫法 <=> set只能使用iterator寫法
            System.out.println(trainList.get(i));//List使用get()方法取得元素的數值
        }

        System.out.println("\n3.承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件:");
        Set<Train> treeSet = new TreeSet<>(trainList);//利用二元樹來排序物件大小(比較準則為compareTo方法)
        for(Train train : treeSet){//for-each寫法
            System.out.println(train);
        }

//        Iterator<Train> trainIterator1 = treeSet.iterator();//iterator寫法
//        while (trainIterator1.hasNext()){
//            System.out.println(trainIterator1.next());
//        }

//        Set<Train> uniqueTrains2 = new HashSet<>();//另一種寫法，使用HashSet並用set特性篩選
//        for (Train train : trainList) {
//            if (uniqueTrains2.add(train)) {//利用集合的不重複加入特性篩選物件，如果能加進set中，就將其打印出來
//                System.out.println(train);
//            }
//        }
    }
}
