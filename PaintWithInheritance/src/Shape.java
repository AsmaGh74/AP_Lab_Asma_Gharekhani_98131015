/**
 * Shape class creates a new shape and acts on it.
 *
 * @author Asma
 */
public abstract class Shape {

    /**
     * Create a new Shape.
     */
    public Shape(){}

    /**
     * Calculate perimeter of the Shape.
     * @return  perimeter of the Shape. This method will be overridden in
     * Circle, Triangle, and Rectangle classes.
     */
    abstract public double calculatePerimeter();

    /**
     * Calculate area of the Shape.
     * @return  area of the Shape. This method will be overridden in
     * Circle, Triangle, and Rectangle classes.
     */
    abstract public double calculateArea();

    /**
     * Print the information of Shape. (Shape type, perimeter, and area)
     */
    abstract public void draw();

    /**
     * Check two Shapes equality.
     * @param shape  Shape to be checked
     * @return true if two shapes are the same. This method will be overridden in
     * Circle, Triangle, and Rectangle classes.
     */
    abstract public boolean equals(Shape shape);

    /**
     * Describe Shape as a String.
     * @return Shape description as a String. This method will be overridden in
     * Circle, Triangle, and Rectangle classes.
     */
    abstract public String toString();
}
