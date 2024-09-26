package JWNS26.src;

public class SimpleTriangle extends GeometricObject {

    public SimpleTriangle(Vertex pos, double width) {
        super(pos, width, Math.sqrt(3) / 2 * width);
    }

    public SimpleTriangle(double x, double y, double width) {
        super(new Vertex(x, y), width);
    }

    @Override
    public double area() {
        return width * height / 2;
    }

    @Override
    public double circumference(){
        return 3*width;
    }
}