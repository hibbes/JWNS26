package JWNS26.src;

class Vertex {
  public double x;
  public double y;

  public Vertex(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public static void main(String[] args) {
    Vertex v1 = new Vertex(42, 17);
    Vertex v2 = new Vertex(0.3, 24.6);
    System.out.println(v1);

    while (v1.x <= 50) {

      v1.x = v1.x + v2.x;
      v1.y = v1.y + v2.y;
      if (v1.x <= 50) {
        System.out.println(v1);
      }
    }
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

}