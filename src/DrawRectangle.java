import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;
/**
 *
 * @author Diamond Zetty
 * CMSC 335
 * 02.06.2024
 * This class allows the program to draw a rectangle based on the given dimensions.
 *
 */
public class DrawRectangle extends JPanel {
    int length;
    int width;
    public DrawRectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public Dimension getPreferredSize() {
        return new Dimension(200,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 100 - (length / 2);
        int y = 100 - (width / 2);
        g.drawRect(x, y, length, width);
    }

}
