package JWNS26.src;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GeometricImage extends GeometricObject implements Paintable, ImageObserver {

    private BufferedImage img = null;
    private String fileName;

    public GeometricImage(String fileName, double x, double y) {
        super(new Vertex(x, y));
        this.fileName = fileName;
        init();
    }

    public BufferedImage get() {
        if (img == null) {
            try {
                img = ImageIO.read(getClass().getResource(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return img;
    }

    private void init() {
        if (img != null) {
            width = img.getWidth();
            height = img.getHeight();
        }
    }

    @Override
    public void paintTo(Graphics g) {
        if (img != null) {
            g.drawImage(img, 0, 0, this); //
        }
    }

    // Überschreiben der Observer-Methode
    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return (infoflags & ALLBITS) == 0; // gibt "false" zurück, falls das Bild noch nicht geladen wurde. Solange
                                           // wartet obiges "DrawImage"
    }

    public static void main(String[] args) {
        PaintableImage pi = new PaintableImage("test.png");
        System.out.println("Breite: " + pi.mi.get().getWidth(pi) + " Höhe: " + pi.mi.get().getHeight(pi));
        ShowInFrame.show(new PaintablePanel(pi));
    }
}