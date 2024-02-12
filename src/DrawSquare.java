
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;

public class DrawSquare extends JPanel {
    int length;
    int height;
    
    public DrawSquare(int length, int height){
        this.length = length;
        this.height = height;
    }
    public Dimension getPreferredSize() {
        return new Dimension(200,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);  

        int x = 100 - (length / 2);
        int y = 100 - (height / 2);
        g.drawRect(x, y, length, height);
    }  
}
