

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;

public class DrawTriangle extends JPanel {
    int base;
    int height;
    
    public DrawTriangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public Dimension getPreferredSize() {
        return new Dimension(200,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);  

        // Draw Text
        int x = 100 - (base / 2);
        int y = 100 + (height / 2);
        g.drawLine(x, y, x, y - height);
        g.drawLine(x, y, x + base, y);
        g.drawLine(x, y - height, x + base, y);
    }  
}
