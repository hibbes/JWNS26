package JWNS26.src;

public class TestGeometricObject {

    public static void main(String[] args) {
        GeometricObject o1 = new GeometricObject(new Vertex(42, 23), 17, 4);
        GeometricObject o2 = new GeometricObject(17, 4);
        GeometricObject o3 = new GeometricObject(17);
        GeometricObject o4 = new GeometricObject();
        SimpleSquare s1 = new SimpleSquare(new Vertex(32,11),22);
        SimpleTriangle t1 = new SimpleTriangle(new Vertex(10,10), 30);

        System.out.println(t1);
        System.out.println(s1);
    }
}