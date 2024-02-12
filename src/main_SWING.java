
import javax.swing.*;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diamond Zetty
 * CMSC 335
 * 02.06.2024
 * This class creates the main gui, drop down menu, text boxes, buttons, and displays the shapes and their calculations when ran.
 *
 */
public class main_SWING extends JFrame{
    
    // first row
    private JLabel jlblSelectShape = new JLabel("Select A Shape");
    private JLabel jlblInvisible0x1 = new JLabel();
    private JLabel jlblInvisible0x2 = new JLabel();
    private JLabel jlblInvisible0x3 = new JLabel();
    
    // second row
    private JComboBox<String> jcbSelectAShape = new JComboBox<String>();
    private JButton jbtnSelectShape = new JButton("Select Shape");
    private JLabel jlblEnterParam1 = new JLabel();
    private JTextField jtfEnterParam1 = new JTextField();
    private JLabel jlblEnterParam2 = new JLabel();
    private JTextField jtfEnterParam2 = new JTextField();

    // third row
    private JLabel jlblInvisible3x0  = new JLabel();
    private JLabel jlblInvisible3x1 = new JLabel();
    private JLabel jlblInvisible3x2 = new JLabel();
    private JButton jbtnDisplayShape = new JButton("Display Shape");

    // fourth row
    private JLabel jlblInvisible4x0  = new JLabel();
    private JLabel jlblInvisible4x1  = new JLabel();
    private JLabel jlblInvisible4x2  = new JLabel();
    private JLabel jlblAreaOrVolume = new JLabel(); 
    
    // fifth row
    private JLabel jlblInvisible5x0  = new JLabel();
    private JLabel jlblInvisible5x1  = new JLabel();
    private JLabel jlblInvisible5x2  = new JLabel();
    private JTextField jtfAreaOrVolume = new JTextField();
    
    private String shape;
    DecimalFormat df = new DecimalFormat("0.00");
    
    public main_SWING () {
        
        setLayout(new GridLayout(0, 4,  5,  5));
        
        // first row
        add(jlblSelectShape);
        add(jlblInvisible0x1);
        add(jlblInvisible0x2);
        add(jlblInvisible0x3);
        
        // second row
        jcbSelectAShape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
            { "Circle", "Sphere","Cone","Cube","Cylinder","Rectangle","Square","Torus","Triangle" }));
        add(jcbSelectAShape);
        add(jbtnSelectShape);
        add(jlblEnterParam1);
        add(jtfEnterParam1);

        
        // third row
        add(jlblInvisible3x0);
        add(jlblInvisible3x1);
        add(jlblEnterParam2);
        add(jtfEnterParam2);
        add(jbtnDisplayShape);   

        // fourth row
        add(jlblInvisible5x0);
        add(jlblInvisible5x1);
        add(jlblInvisible5x2);
        add(jlblAreaOrVolume);
        
        // fifth row
        add(jlblInvisible4x0);
        add(jlblInvisible4x1);
        add(jlblInvisible4x2);
        add(jtfAreaOrVolume);         

  
        pack();
        
        
        jbtnSelectShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSelectShapeActionPerformed(evt);
            }
        });
        

        jbtnDisplayShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDisplayShapeActionPerformed(evt);
            }
        });        
        
        
        
    }
    
    public static void main( String[] args) {
        JFrame frame = new main_SWING();
        frame.setTitle("SWING Shapes");
        //frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
    
    private void jbtnSelectShapeActionPerformed(java.awt.event.ActionEvent evt) {     

        shape = String.valueOf(jcbSelectAShape.getSelectedItem());
        
        switch(shape){
            case "Circle":
                clearGUI();
                jlblEnterParam1.setText("Enter Radius");
                jtfEnterParam1.setVisible(true);
                break;
            case "Sphere":
                clearGUI();
                jlblEnterParam1.setText("Enter Radius");
                jtfEnterParam1.setVisible(true);                              
                break;
            case "Cube":
                clearGUI();
                jlblEnterParam1.setText("Enter Side Length");
                jtfEnterParam1.setVisible(true);
                break;
            case "Square":
                clearGUI();
                jlblEnterParam1.setText("Enter Edge length");
                jtfEnterParam1.setVisible(true);
                break;
            case "Triangle":
                clearGUI();
                jlblEnterParam1.setText("Enter Side 1");
                jlblEnterParam2.setText("Enter Side 2");
                jtfEnterParam1.setVisible(true);
                jtfEnterParam2.setVisible(true);
                break;
            case "Cone":
                clearGUI();
                jlblEnterParam1.setText("Enter Radius");
                jlblEnterParam2.setText("Enter Height");
                jtfEnterParam1.setVisible(true);
                jtfEnterParam2.setVisible(true);
                break;
            case "Cylinder":
                clearGUI();
                jlblEnterParam1.setText("Enter Radius");
                jlblEnterParam2.setText("Enter Height");
                jtfEnterParam1.setVisible(true);
                jtfEnterParam2.setVisible(true);
                break;
            case "Torus":
                clearGUI();
                jlblEnterParam1.setText("Enter Inner Radius");
                jlblEnterParam2.setText("Enter Outer Radius");
                jtfEnterParam1.setVisible(true);
                jtfEnterParam2.setVisible(true);
                break;
            case "Rectangle":
                clearGUI();
                jlblEnterParam1.setText("Enter Length");
                jlblEnterParam2.setText("Enter Width");
                jtfEnterParam1.setVisible(true);
                jtfEnterParam2.setVisible(true);
                break;

           
        }
    }  
    
    private void jbtnDisplayShapeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JFrame jFrame1 = new JFrame(shape);
        double radius;
        double edge;
        double innerRadius;
        double outerRadius;
        double height;
        double length;
        double width;
        double sidelength;
        double side1;
        double side2;

        

        switch(shape){
            case "Circle":
                radius = Double.parseDouble(jtfEnterParam1.getText());
                jlblAreaOrVolume.setText("Area:");
                jtfAreaOrVolume.setText(df.format(Controller.getAreaOfCircle(radius)));
                jFrame1.add(new DrawCircle((int)radius));
                break;    
            case "Sphere":
                radius = Double.parseDouble(jtfEnterParam1.getText()); 
                jlblAreaOrVolume.setText("Volume:");
                jtfAreaOrVolume.setText(df.format(Controller.getVolumeOfSphere(radius)));
                jFrame1.add(new JLabel(new ImageIcon("Sphere.jpg")));
                break;
            case "Cube":
                edge = Double.parseDouble(jtfEnterParam1.getText());
                jlblAreaOrVolume.setText("Volume:");
                jtfAreaOrVolume.setText(df.format(Controller.getVolumeOfCube(edge)));
                jFrame1.add(new JLabel(new ImageIcon("Cube_Drawing.jpg")));
                break;
            case "Torus":
                innerRadius = Double.parseDouble(jtfEnterParam1.getText());
                outerRadius = Double.parseDouble(jtfEnterParam2.getText());
                jlblAreaOrVolume.setText("Volume:");
                jtfAreaOrVolume.setText(df.format(Controller.getVolumeOfTorus(innerRadius,outerRadius)));
                jFrame1.add(new JLabel(new ImageIcon("Torus-.jpg")));
                break;
            case "Cylinder":
                radius = Double.parseDouble(jtfEnterParam1.getText());
                height = Double.parseDouble(jtfEnterParam2.getText());
                jlblAreaOrVolume.setText("Volume:");
                jtfAreaOrVolume.setText(df.format(Controller.getVolumeOfCylinder(radius,height)));
                jFrame1.add(new JLabel(new ImageIcon("Cylinder1.jpeg")));
                break;
            case "Cone":
                radius = Double.parseDouble(jtfEnterParam1.getText());
                height = Double.parseDouble(jtfEnterParam2.getText());
                jlblAreaOrVolume.setText("Volume:");
                jtfAreaOrVolume.setText(df.format(Controller.getVolumeOfCone(radius,height)));
                jFrame1.add(new JLabel(new ImageIcon("Cone_Drawing.jpg")));
                break;
            case "Square":
                sidelength = Double.parseDouble(jtfEnterParam1.getText());
                jlblAreaOrVolume.setText("Area:");
                jtfAreaOrVolume.setText(df.format(Controller.getAreaOfSquare(sidelength)));
                jFrame1.add(new DrawSquare((int)sidelength,(int)sidelength));
                break;
            case "Triangle":
                side1 = Double.parseDouble(jtfEnterParam1.getText());
                side2 = Double.parseDouble(jtfEnterParam2.getText());
                jlblAreaOrVolume.setText("Area:");
                jtfAreaOrVolume.setText(df.format(Controller.getAreaOfTriangle(side1,side2)));
                jFrame1.add(new DrawTriangle((int)side1,(int)side2));
                break;
            case "Rectangle":
                length = Double.parseDouble(jtfEnterParam1.getText());
                width = Double.parseDouble(jtfEnterParam2.getText());
                jlblAreaOrVolume.setText("Area:");
                jtfAreaOrVolume.setText(df.format(Controller.getAreaOfRectangle(length,width)));
                jFrame1.add(new DrawRectangle((int)length,(int)width));
                break;

        }
        

        jFrame1.setLocationRelativeTo(null);
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame1.setVisible(true);
        jFrame1.pack();
    }  
    
    
    private void clearGUI() {
        jlblEnterParam1.setText("");
        jtfEnterParam1.setText("");
        jlblEnterParam2.setText("");
        jtfEnterParam2.setText("");
              
        jlblAreaOrVolume.setText("");
        jtfAreaOrVolume.setText("");
        
        jlblAreaOrVolume.setText("");
        jtfAreaOrVolume.setText("");        
        
        jtfEnterParam1.setVisible(false);
        jtfEnterParam2.setVisible(false);

    }
}
