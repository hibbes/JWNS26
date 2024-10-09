package JWNS26.src;

import java.awt.Color;

public class SimpleRectangle extends GeometricObject {

    public SimpleRectangle(Vertex pos, double width, double height, Color color) {
        super(pos, width, height, color);
    }

    public SimpleRectangle(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height, new Color(0, 0, 0));
    }

    @Override
    public String toString() {
        return "SimpleRectangle: " + super.toString();
    }
}