package JWNS26.src;

import java.awt.Color;

public class SimpleTriangle extends GeometricObject {

    public SimpleTriangle(Vertex pos, double width, Color color) {
        super(pos, width, Math.sqrt(3) / 2 * width, color);
    }

    public SimpleTriangle(double x, double y, double width) {
        super(new Vertex(x, y), width);
    }

    @Override
    public double area() {
        return width * height / 2;
    }

    @Override
    public double circumference() {
        return 3 * width;
    }

    @Override
    public String toString() {
        return "SimpleTriangle: " + super.toString();
    }
}