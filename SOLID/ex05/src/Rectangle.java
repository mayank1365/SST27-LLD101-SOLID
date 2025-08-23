public class Rectangle implements IShape {
    protected int w, h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int area() {
        return this.w * this.h;
    }
}