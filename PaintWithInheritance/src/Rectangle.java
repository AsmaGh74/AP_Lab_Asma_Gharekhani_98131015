import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Rectangle class creates a new Rectangle and acts on it, like calculating perimeter and area.
 *
 * @author Asma
 */
public class Rectangle extends Polygon{
    // stores the sides of the Rectangle
    private ArrayList<Double> sides;

    /**
     * Create a new Rectangle with specific sides.
     * @param side1  length or width of the Rectangle
     * @param side2  length or width of the Rectangle
     * @param side3  equal to side1
     * @param side4  equal to side2
     */
    public Rectangle(double side1, double side2, double side3, double side4){
        super(side1, side2, side3, side4);
        this.sides = new ArrayList<>();
        this.sides = super.getSides();
    }

    /**
     * Check if the Rectangle is also a square.
     * @return  true if the Rectangle is also a square.
     */
    public boolean isSquare(){
        ArrayList<Double> sides = new ArrayList<>();
        sides = super.getSides();
        if (sides.get(0).compareTo(sides.get(1)) == 0) return true;
        return false;
    }

    /**
     * Calculate perimeter of the Rectangle.
     * @return  perimeter of the Rectangle
     */
    public double calculatePerimeter(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(2*(sides.get(0)+sides.get(1))));
    }

    /**
     * Calculate area of the Rectangle.
     * @return  area of the Rectangle
     */
    public double calculateArea(){
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(sides.get(0)*sides.get(1)));
    }

    /**
     * Print Rectangle information (Shape type, perimeter, and area).
     */
    public void draw(){
        System.out.print("Shape Type:  Rectangle\nPerimeter:  " + calculatePerimeter() +
                "\nArea:  " + calculateArea() + "\n");
    }

    /**
     * Check equality of two rectangles.
     * @param shape  Shape to be checked
     * @return  true if two Rectangles are the same.
     */
    public boolean equals(Shape shape){
        if (this == shape) return true;
        if (!(shape instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) shape;
        return new HashSet<>(this.sides).equals(new HashSet<>(rectangle.getSides()));
    }


    /**
     * Describe Rectangle as a String.
     * @return  Rectangle description as a String.
     */
    public String toString(){
        return "Rectangle:: side1: " + sides.get(0) +
                ", side2: " + sides.get(1);
    }
}
