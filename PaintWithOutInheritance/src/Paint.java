import java.util.ArrayList;

/**
 * Paint class stores a list of every shapes and acts on these lists.
 *
 * @author Asma
 */
public class Paint {
    // list of circles
    private ArrayList<Circle> circles;
    // list of triangles
    private ArrayList<Triangle> triangles;
    // list of rectangles
    private ArrayList<Rectangle> rectangles;

    /**
     * Create a new shape and lists of that.
     */
    public Paint(){
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * Add a new Circle to circles list.
     * @param circle  circle to be added
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * Add a new Triangle to triangles list.
     * @param triangle  triangle to be added
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * Add a new Rectangle to rectangles list.
     * @param rectangle  rectangle to be added
     */
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * Print information of all shapes.
     */
    public void drawAll(){
        System.out.println("*****************************");
        System.out.println("Shapes information:");
        for (Circle circle:circles) {
            circle.draw();
            System.out.println();
        }
        for (Triangle triangle:triangles) {
            triangle.draw();
            System.out.println();
        }
        for (Rectangle rectangle:rectangles) {
            rectangle.draw();
            System.out.println();
        }
        System.out.println("*****************************");
    }

    /**
     * Describe all shapes in the lists.
     */
    public void printAll(){
        System.out.println("*****************************");
        System.out.println("Shapes description:");
        for (Circle circle:circles) {
            System.out.println(circle.toString());
        }
        for (Triangle triangle:triangles) {
            System.out.println(triangle.toString());
        }
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle.toString());
        }
        System.out.println("*****************************");
    }
}
