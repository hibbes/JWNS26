package JWNS26.src;

public class Test {
  public static void main(String[] args) {
    Vertex v1 = new Vertex(4, 3);

    System.out.println(v1);
    System.out.println(v1.length());
    v1.normalize();
    System.out.println(v1);
  }
}
