
public class Shape {
    
    int numberOfDimensions;
    String name;
    
    Shape(int d, String n) {
        numberOfDimensions = d;
        name = n;
    }
    
    int getNumberOfDimensions() {
        return numberOfDimensions;
    }
   
    
    String getName() {
        return name;
    }
}

//-----------------------------------------------------------------------

class TwoDimensionalShape extends Shape {

        double dimension1;
        double dimension2;
        
        TwoDimensionalShape(double d1, double d2, String name) {
            super(2, name);
            dimension1 = d1;
            dimension2 = d2;
        }
	
	public double getArea() {
            return dimension1 * dimension2 ;
        } 
}

//-----------------------------------------------------------------------


class Rectangle extends TwoDimensionalShape{

	public Rectangle(double length, double width) {
		super(length, width, "Rectangle");
	}
}


//-----------------------------------------------------------------------


class Square extends TwoDimensionalShape{

	public Square(double sideLength) {
		super(sideLength, sideLength, "Square");
	}
}

//-----------------------------------------------------------------------


class Triangle extends TwoDimensionalShape{

	public Triangle(double side1, double side2) {
		super(side1, 0.5 * side2, "Triangle");
	}
}


//-----------------------------------------------------------------------



class Circle extends TwoDimensionalShape{

	public Circle(double radius) {
		super(radius, radius * Math.PI, "Circle");
	}
}


//-----------------------------------------------------------------------

class ThreeDimensionalShape extends Shape {
        
        double dimension1;
        double dimension2;
        double dimension3;
        
        ThreeDimensionalShape(double d1, double d2, double d3, String name) {
            super(3, name);
            dimension1 = d1;
            dimension2 = d2;
            dimension3 = d3;
        }

	public double getVolume() {
            return dimension1 * dimension2 * dimension3;
        } 
}


//-----------------------------------------------------------------------


class Cone extends ThreeDimensionalShape{

	public Cone(double radius, double height) {
		super(1.0/3.0, Math.PI * Math.pow(radius,2), height, "Cone");
	}
}

//-----------------------------------------------------------------------


class Cube extends ThreeDimensionalShape{

	public Cube(double edgeLength) {
		super(edgeLength, edgeLength, edgeLength, "Cube");
	}
}

//-----------------------------------------------------------------------


class Cylinder extends ThreeDimensionalShape{

	public Cylinder(double radius, double height) {
		super(1, Math.PI * Math.pow(radius, 2), height, "Cylinder");
	}
}

//-----------------------------------------------------------------------

class Sphere extends ThreeDimensionalShape{

	public Sphere(double radius) {
		super(4.0/3.0 , Math.PI * Math.pow(radius, 3), 1, "Sphere");
	}
}

//-----------------------------------------------------------------------

class Torus extends ThreeDimensionalShape{

	public Torus(double innerRadius, double outerRadius) {
		super(2, Math.pow(Math.PI, 2) * outerRadius, Math.pow(innerRadius, 2), "Torus");
	}
}

//-----------------------------------------------------------------------
