package LiskovSubstitution;

public class Rectangel extends QuadRangle{
    public int width;
    public int height;

    public Rectangel(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int area() {
        return height * width;
    }
}
