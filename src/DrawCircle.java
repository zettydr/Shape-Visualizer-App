

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;

public class DrawCircle extends JPanel{
    int radius;
    
    public DrawCircle(int radius){
        this.radius = radius;
    }
    public Dimension getPreferredSize() {
        return new Dimension(200,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        int x = 100 - (radius / 2);
        int y = 100 - (radius / 2);
        g.drawOval(x, y, radius,radius);
    }  
}
