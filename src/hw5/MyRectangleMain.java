package hw5;

public class MyRectangleMain {
    public static void main(String[] args) {

        MyRectangle myRectangle = new MyRectangle();
        MyRectangle myRectangle1 = new MyRectangle(10, 20);

        myRectangle.setWidth(10);
        myRectangle.setDepth(20);

        System.out.println("使用無參建構子的結果:" + myRectangle.getArea());
        System.out.println("使用有參建構子的結果:" + myRectangle1.getArea());
    }
}
