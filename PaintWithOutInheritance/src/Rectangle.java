import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Rectangle class creates a rectangle with specific length and width and calculates perimeter and area of that.
 *
 * @author Asma
 */
public class Rectangle {
    // stores rectangle sides
    ArrayList<Double> sides;

    /**
     * Create a new rectangle with specified sides (length and width).
     * @param side1  length or width of the rectangle
     * @param side2  length or width of the rectangle
     * @param side3  equals to side1
     * @param side4  equals to side2
     */
    public Rectangle(double side1, double side2, double side3, double side4){
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    /**
     * Get the sides of the rectangle.
     * @return  sides of the rectangle
     */
    public ArrayList<Double> getSides(){
        return sides;
    }

    /**
     * Check if the rectangle is also a square.
     * @return  true if the rectangle is also a square.
     */
    public boolean isSquare(){
        if (sides.get(0).compareTo(sides.get(1)) == 0) return true;
        return false;
    }

    /**
     * Calculate perimeter of the rectangle.
     * @return  perimeter of the rectangle
     */
    public double calculatePerimeter(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(2*(sides.get(0)+sides.get(1))));
        }

    /**
     * Calculate area of the rectangle.
     * @return  area of the rectangle
     */
    public double calculateArea(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(sides.get(0)*sides.get(1)));}

    /**
     * Print rectangle information.
     */
    public void draw(){
        System.out.print("Shape Type:  Rectangle\nPerimeter:  " + calculatePerimeter() +
                "\nArea:  " + calculateArea());
    }

    /**
     * Check equality of two rectangles.
     * @param rectangle  rectangle to be checked
     * @return  true if two rectangles are the same.
     */
    public boolean equals(Rectangle rectangle){
        return new HashSet<>(this.sides).equals(new HashSet<>(rectangle.getSides()));}

    /**
     * Describe shape as a string.
     * @return  shape information as string.
     */
    public String toString(){
        String description = "A rectangle with sides " + sides.get(0) +
                " and " + sides.get(1);
        if (isSquare()) {
            return description + "  : is Square";
        }
        return description;
    }
}
