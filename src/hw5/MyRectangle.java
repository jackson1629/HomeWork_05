package hw5;

public class MyRectangle {

    public MyRectangle() {
    }

    public MyRectangle(double width, double depth) {
        setWidth(width);
        setDepth(depth);
    }

    private double width, depth;

    public void setWidth(double width) {

        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("長度不能為負值");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setDepth(double depth) {

        if (depth > 0) {
            this.depth = depth;
        } else {
            System.out.println("長度不能為負值");
        }
    }

    public double getDepth() {
        return depth;
    }

    public double getArea() {
        return width * depth;
    }
}
