package JWNS26.src;

public class Test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(42, 17);
        Vertex v2 = new Vertex(0.3, 24.6);
        Vertex v3 = v1.skalarMult(2);
    
        System.out.println(v1);
        System.out.println(v3);
        System.out.println(v1.length());
        System.out.println(v2.length());
        System.out.println(v1.equals(v3));
        System.out.println(v1.equals(v1));
    
      }
}
