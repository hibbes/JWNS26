package JWNS26.src;

public class SimpleOval extends GeometricObject {

    public SimpleOval(Vertex pos, double width, double height) {
        super(pos, width, height);

    }

    @Override public String toString() {
        return "SimpleOval: " + super.toString();

    }

}
