package work1;

// Прямоугольник
public class Rectangle {
    protected int height;
    protected int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return height * width;
    }
}