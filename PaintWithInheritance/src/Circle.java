import java.text.DecimalFormat;

/**
 * Circle class creates a new circle and acts on it, like calculating perimeter and area.
 *
 * @author Asma
 */
public class Circle extends Shape{
    // stores radius of the circle
    private double radius;

    /**
     * Create a new Circle with specified radius.
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Get radius of the circle.
     * @return  radius of the circle
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Calculate perimeter of the Circle.
     * @return  perimeter of the Circle.
     */
    public double calculatePerimeter(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(2*Math.PI*radius));
    }

    /**
     * Calculate area of the Circle.
     * @return  area of the Circle
     */
    public double calculateArea(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(Math.PI*Math.pow(radius, 2)));
    }

    /**
     * Print Circle information (Shape type, perimeter, and area).
     */
    public void draw(){
        System.out.print("Shape Type:  Circle\nPerimeter:  " + calculatePerimeter() +
                "\nArea:  " + calculateArea() + "\n");
    }

    /**
     * Check equality of two circles.
     * @param shape  shape to be checked
     * @return  true if two circles are the same.
     */
    public boolean equals(Shape shape){
        if (this == shape) return true;
        if (!(shape instanceof Circle)) return false;
        Circle circle = (Circle) shape;
        if (this.radius == circle.getRadius()) return true;
        return false;
    }

    /**
     * Describe Shape as a String.
     * @return  Shape description as a String.
     */
    public String toString(){
        return  "Circle::  radius: " + radius;
    }
}
