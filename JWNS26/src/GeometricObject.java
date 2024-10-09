package JWNS26.src;

import java.awt.Color;

public class GeometricObject {

    public Vertex pos;
    public double width;
    public double height;
    public Color color;

    public GeometricObject(Vertex pos, double width, double height, Color color) {
        this.pos = pos;
        this.color = color;

        if (width < 0) {
            this.width = Math.abs(width);
            this.pos.x = this.pos.x - this.width;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = Math.abs(height);
            this.pos.y = this.pos.y - this.height;
        } else {
            this.height = height;
        }

    }

    public GeometricObject(double posx, double posy, double width, double height) {
        this(new Vertex(posx, posy), width, height, new Color(0, 0, 0));

    }

    public GeometricObject(Vertex pos, double width) {
        this(pos, width, width, new Color(0, 0, 0));
    }

    public GeometricObject(double width, double height) {
        this(0, 0, width, height);
    }

    public GeometricObject(double x) {
        this(x, x);
    }

    public GeometricObject() {
        this(10, 10);

    }

    public double circumference() {
        return 2 * (height + width);
    }

    public double area() {
        return height * width;
    }

    public boolean contains(Vertex v) {
        return v.x >= pos.x && v.x <= pos.x + width && v.y >= pos.y && v.y <= pos.y + height;
        // ist x im GeometricObject?
    }

    public boolean isLargerAs(GeometricObject that) {
        return this.area() > that.area();
    }

    public void moveTo(Vertex v) {
        pos = v;
    }

    public void moveTo(double x, double y) {
        moveTo(new Vertex(x, y));
    }

    public void move(Vertex v) {
        moveTo(pos.add(v));
    }

    public boolean equals(GeometricObject thatObject) {
        if (thatObject instanceof GeometricObject) {
            GeometricObject that = (GeometricObject) thatObject;
            return this.pos.equals(that.pos) && // Position gleich?
                    this.width == that.width && // Breite gleich?
                    this.height == that.height; // Höhe gleich?
        }
        return false;
    }

    public String toString() {
        return "pos: " + pos + " w: " + width + " h: " + height;
    }

}