package hw5.hwext;

public class PenMain {
    public static void main(String[] args) {
        Pen[] pen = new Pen[2];
        pen[0] = new Pencil("Faber-Castell", 10);
        pen[1] = new InkBrush("Sumi", 100);

        for (int i = 0; i < pen.length; i++) {
            pen[i].write();
            System.out.println(pen[i].getBrand() + " 的價格為 " + pen[i].getPrice());
        }
    }
}
