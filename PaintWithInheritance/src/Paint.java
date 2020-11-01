import java.util.ArrayList;

/**
 * Paint class stores a list of Shapes and acts on them.
 *
 * @author Asma
 */
public class Paint {
    // stores whole shapes in the list
    private ArrayList<Shape> shapes;

    /**
     * Create a new Paint and store shapes in it.
     */
    public Paint(){
        shapes = new ArrayList<>();
    }

    /**
     * Add a new Shape to shapes list of the pain.
     * @param shape  shape to be added to the list
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * Print information (Shape type, perimeter, and area) of all shapes in the list.
     */
    public void drawAll(){
        System.out.println("**************************************");
        System.out.println("Shapes information:");
        for (Shape shape:shapes) {
            shape.draw();
        }
        System.out.println("**************************************");
    }

    /**
     * Print description (Shape type and sides) of all shapes in the list.
     */
    public void printAll(){
        System.out.println("**************************************");
        System.out.println("Shapes description:");
        for (Shape shape:shapes) {
            System.out.println(shape.toString());
            System.out.println();
        }
        System.out.println("**************************************");
    }

    /**
     * Print shapes( Triangles or Rectangles) with equal sides.
     */
    public void describeEqualSides(){
        System.out.println("**************************************");
        System.out.println("List shapes with equal sides:");
        for (Shape shape:shapes) {
            if (shape instanceof Rectangle){
                if (((Rectangle) shape).isSquare()) System.out.println(shape.toString());
            }
            else if (shape instanceof Triangle){
                if (((Triangle) shape).isEquilateral()) System.out.println(shape.toString());
            }
        }
        System.out.println("**************************************");
    }
}
