package JWNS26.src;

import java.awt.Color;

public class PaintableOval extends SimpleOval implements Paintable {

    public PaintableOval(Vertex pos, double width, double height, Color color) {
        super(pos, width, height, color);
    }

    public PaintableOval(double x, double y, double width, double height, Color color) {
        this(new Vertex(x, y), width, height, color);
    }

    public PaintableOval(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height, new Color(0, 0, 0));
    }

    public void paintTo(java.awt.Graphics g) {
        g.setColor(color);
        g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height);
    }
}
