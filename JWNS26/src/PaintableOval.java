package JWNS26.src;

public class PaintableOval extends SimpleOval implements Paintable{

    public PaintableOval(double x, double y, double width, double height){
        super(x,y, width, height);
    }


    public void paintTo(java.awt.Graphics g){
        g.fillOval((int)pos.x,(int)pos.y,(int)width, (int)height);
    }
}
