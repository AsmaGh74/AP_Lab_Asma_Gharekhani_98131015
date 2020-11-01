import java.text.DecimalFormat;

/**
 * Circle class creates a new circle with a specific radius and calculates perimeter and area of the circle.
 *
 * @author Asma
 */
public class Circle {
    // radius of circle
    private double radius;

    /**
     * Create a new circle with specified radius.
     * @param radius  radius of circle
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Get the radius of the circle.
     * @return  radius of the circle
     */
    public double getRadius(){
        return radius;
    }

    /**
     * Calculate perimeter of the circle.
     * @return  perimeter of the circle
     */
    public double calculatePerimeter(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(2*Math.PI*radius));
    }

    /**
     * Calculate area of the circle.
     * @return  area of the circle
     */
    public double calculateArea(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(Math.PI*Math.pow(radius, 2)));
    }

    /**
     * Print shape information.
     */
    public void draw(){
        System.out.print("Shape Type:  Circle\nPerimeter:  " + calculatePerimeter() +
                "\nArea:  " + calculateArea());
    }

    /**
     * Check equality of two circles.
     * @param circle  circle to be checked
     * @return  true if two circles are the same.
     */
    public boolean equals(Circle circle){
        if (this.radius == circle.getRadius()) return true;
        return false;
    }

    /**
     * Describe shape as a string.
     * @return  shape information as a string.
     */
    public String toString(){
        return "A circle with a radius of " + radius;}
}
