package JWNS26.src;

public class SimpleRectangle extends GeometricObject {

    public SimpleRectangle(Vertex pos, double width, double height) {
        super(pos, width, height);
    }

    public SimpleRectangle(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height);
    }

}