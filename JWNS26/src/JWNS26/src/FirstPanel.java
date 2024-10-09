package JWNS26.src;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class FirstPanel extends JPanel {
    private static String title = "Test";
    @Override
    
    public void paintComponent(java.awt.Graphics g) {
        g.fillRect(100,100, 200, 200);
        g.fillRoundRect(400, 100, 100, 50, 10, 10); 
    }

    public static void main(String[] args){
            JFrame f = new JFrame(title);
            f.add(new FirstPanel());
           // f.pack();
            f.setVisible(true);
        }
}

