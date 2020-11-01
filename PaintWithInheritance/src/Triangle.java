import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Triangle class creates a new Triangle and acts on it, like calculating perimeter and area.
 *
 * @author Asma
 */
public class Triangle extends Polygon{
    // stores sides of the Triangle
    ArrayList<Double> sides;

    /**
     * Create a new Triangle with specific sides.
     * @param side1  side number 1 of the Triangle
     * @param side2  side number 2 of the Triangle
     * @param side3  side number 3 of the Triangle
     */
    public Triangle(double side1, double side2, double side3){
        super(side1, side2, side3);
        this.sides = new ArrayList<>();
        this.sides = super.getSides();
    }

    /**
     * Check if the Triangle is equilateral.
     * @return  true if the Triangle is equilateral
     */
    public boolean isEquilateral(){
        ArrayList<Double> sides = new ArrayList<>();
        sides = super.getSides();
        if (sides.get(0).compareTo(sides.get(1)) == 0) return true;
        if (sides.get(0).compareTo(sides.get(2)) == 0) return true;
        if (sides.get(1).compareTo(sides.get(2)) == 0) return true;
        return false;
    }

    /**
     * Calculate perimeter of the Triangle.
     * @return  perimeter of the Triangle
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * Calculate area of the Triangle.
     * @return  area of the Triangle
     */
    public double calculateArea(){
        DecimalFormat df = new DecimalFormat("####0.00");
        double s = 0.5 * calculatePerimeter();
        return Double.parseDouble(df.format(Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)))));
    }

    /**
     * Print Triangle information (Shape type, perimeter, and area).
     */
    public void draw(){
        System.out.print("Shape Type:  Triangle\nPerimeter:  " + calculatePerimeter() +
                "\nArea:  " + calculateArea() + "\n");
    }

    /**
     * Check equality of two Triangles.
     * @param shape  Triangle to be checked
     * @return  true if two Triangles are the same.
     */
    public boolean equals(Shape shape){
        if (this == shape) return true;
        if (!(shape instanceof Rectangle)) return false;
        Triangle triangle = (Triangle) shape;
        return new HashSet<>(this.sides).equals(new HashSet<>(triangle.getSides()));
    }


    /**
     * Describe Triangle as a String.
     * @return  Triangle description as a String.
     */
    public String toString(){
        return "Triangle:: side1: " + sides.get(0) +
                ", side2: " + sides.get(1) +
                ", side3: " + sides.get(2);
    }
}
