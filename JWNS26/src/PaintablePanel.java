package JWNS26.src;
import JWNS26.src.util.ShowInFrame;
import java.awt.Color;

public class PaintablePanel extends SizedPanel{
    
  Paintable pa;
  public PaintablePanel(Paintable pa){this.pa=pa;}

 public void paintComponent(java.awt.Graphics g){
      pa.paintTo(g);
 }
public static void main(String[] args) {
    
    ShowInFrame.show(new PaintablePanel(new PaintableOval(100,50,30,50, new Color(124,50,8))));
    ShowInFrame.show(new PaintablePanel(new PaintableOval(10,10,130,40)));
}

}
