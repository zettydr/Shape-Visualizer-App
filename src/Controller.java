
public class Controller {
    
    static double getAreaOfCircle(double radius) {
        
        return new Circle(radius).getArea();
    }
    
    static double getAreaOfRectangle(double length, double width) {
        
        return new Rectangle(length, width).getArea();
    }
            
    static double getAreaOfSquare(double side) {
        
        return new Square(side).getArea();
    }
    
    static double getAreaOfTriangle(double side1, double side2) {
        
        return new Triangle(side1, side2).getArea();
    }

    static double getVolumeOfSphere(double radius) {
        
        return new Sphere(radius).getVolume();
    }

    static double getVolumeOfCube(double edge) {
        
        return new Cube(edge).getVolume();
    }
    
    static double getVolumeOfCone(double baseRadius, double height) {
        
        return new Cone(baseRadius, height).getVolume();
    }   

    static double getVolumeOfCylinder(double baseRadius, double height) {
        
        return new Cylinder(baseRadius, height).getVolume();
    }
				
    static double getVolumeOfTorus(double innerRadius, double outerRadius) {
        
        return new Torus(innerRadius, outerRadius).getVolume();
    }
	
}
