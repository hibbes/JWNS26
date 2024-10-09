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
    Vertex v3 = v1.skalarMult(2);

    System.out.println(v1);
    System.out.println(v3);
    System.out.println(v1.length());
    System.out.println(v2.length());
    System.out.println(v1.equals(v3));
    System.out.println(v1.equals(v1));

  }

  public double length() {
    return Math.sqrt(x * x + y * y);
  }

  public Vertex skalarMult(double s) {
    return new Vertex(x * s, y * s);
  }

  public void skalarMultMod(double s) {
    x = x * s;
    y = y * s;
  }

  public Vertex add(Vertex that) {
    return new Vertex(x + that.x, y + that.y);
  }

  public Vertex sub(Vertex that){
    return new Vertex(x - that.x, y - that.y);
  }

  public double distance(Vertex that){
    double x_diff = that.x-this.x;
    double y_diff = that.y-this.y;
    return Math.sqrt(x_diff * x_diff + y_diff * y_diff);
  }

  public void addMod(Vertex that) {
    x += that.x;
    y += that.y;

    // x=x+v2.x; Langform
    // y=y+v2.y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String toString() {

    return "(" + x + "," + y + ")";
  }

  public boolean equals(Object thatObject) {
    if (thatObject instanceof Vertex) {
      Vertex that = (Vertex) thatObject;

      return this.x == that.x && this.y == that.y;
    }
    return false;

  }

  public void normalize() {
    double factor = this.length();
    x = x / factor;
    y = y / factor;

  }

}