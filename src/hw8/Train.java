package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {//實作Comparable介面的抽象方法compareTo
    private int number;
    private String type, start, dest;
    private double price;

    public Train(int number, String type, String start, String dest, double price) {
        setNumber(number);
        setType(type);
        setStart(start);
        setDest(dest);
        setPrice(price);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStart() {
        return start;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDest() {
        return dest;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {//覆寫toString()方法，讓print出來的物件資訊不是 "類名和物件的HashCode"
        return "Train: " + "number=" + number + ", type='" + type + ", start='" + start + ", dest='" + dest + ", price=" + price;
    }

    public int compareTo(Train other) {//比較自訂義物件大小
        return other.getNumber() - this.getNumber();
    }
    public int hashCode() {//先用hashCode做模糊比對
        return Objects.hash(number, type, start, dest, price);//用Objects.hash生成hashCode進行模糊比對
    }
    public boolean equals(Object obj) {//使用equals做明確比對
        if (this == obj) return true;//物件是否為自己本身

        if (obj == null || getClass() != obj.getClass()) return false;//物件非空值 且為同一類別

        Train train = (Train) obj;//轉型為Train類別，用來取出屬性值做比對
        return number == train.number &&//數值比對
                Double.compare(train.price, price) == 0 &&
//              Double.compare(a, b) 方法返回一個整數值，表示 a 和 b 之間的關系：
//              如果 a 小於 b，返回負整數
//              如果 a 等於 b，返回零。
//              如果 a 大於 b，返回正整數
                Objects.equals(type, train.type) &&//原本object的"=="比對
                Objects.equals(start, train.start) &&//原本object的"=="比對
                Objects.equals(dest, train.dest);//原本object的"=="比對
    }
}
