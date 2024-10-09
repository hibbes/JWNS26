package JWNS26.src;

import javax.swing.*;
import java.awt.Dimension;

public class SizedPanel extends JPanel {
    int preferredWidth = 300;
    int preferredHeight = 400;

    public SizedPanel(int w, int h) {
        preferredWidth = w;
        preferredHeight = h;
    }

    public SizedPanel() {
    };

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(preferredWidth, preferredHeight);
    }

    public static void main(String[] args) {
        ShowInFrame.show("Zweiter Test", new SizedPanel());
    }
}
