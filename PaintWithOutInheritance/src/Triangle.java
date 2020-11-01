import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Triangle class creates a triangle with specific sides and calculates perimeter and area of that.
 *
 * @author Asma
 */
public class Triangle {
    // stores triangle sides
    private ArrayList<Double> sides;

    /**
     * Create a new triangle with specified sides.
     * @param side1  triangle side number 1
     * @param side2  triangle side number 2
     * @param side3  triangle side number 3
     */
    public Triangle(double side1, double side2, double side3){
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    /**
     * Get the sides of the triangle.
     * @return sides of the triangle
     */
    public ArrayList<Double> getSides(){
        return sides;
    }

    /**
     * Check if the triangle is Equilateral or not.
     * @return true if the triangle is Equilateral.
     */
    public boolean isEquilateral(){
        if (sides.get(0).compareTo(sides.get(1)) == 0) return true;
        if (sides.get(0).compareTo(sides.get(2)) == 0) return true;
        if (sides.get(1).compareTo(sides.get(2)) == 0) return true;
        return false;
    }

    /**
     * Calculate perimeter of the triangle.
     * @return  perimeter of the triangle
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    /**
     * Calculate area of the triangle based on heron's formula.
     * @return area of the triangle
     */
    public double calculateArea() {
        DecimalFormat df = new DecimalFormat("####0.00");
        double s = 0.5 * calculatePerimeter();
        return Double.parseDouble(df.format(Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)))));
    }
    /**
     * Print triangle information.
     */
    public void draw(){
        System.out.print("Shape Type:  Triangle\nPerimeter:  " + calculatePerimeter() +
                "\nArea:  " + calculateArea());
    }

    /**
     * Check equality of two triangles.
     * @param triangle  triangle to be checked
     * @return  true if two triangles are the same.
     */
    public boolean equals(Triangle triangle){
        return new HashSet<>(this.sides).equals(new HashSet<>(triangle.getSides()));}

    /**
     * Describe shape as a string.
     * @return  shape information as string.
     */
    public String toString() {
        String description = "A triangle with sides " + sides.get(0) + ", " +
                sides.get(1) + ", and " + sides.get(2);
        if (isEquilateral()) return description + "  : is Equilateral";
        return description;
    }
}
