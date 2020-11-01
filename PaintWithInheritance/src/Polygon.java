import java.util.ArrayList;

/**
 * Polygon class creates a new Polygon and acts on it.
 *
 * @author Asma
 */
public abstract class Polygon extends Shape{
    // stores sides of the polygon
    private ArrayList<Double> sides;

    /**
     * Create a new Polygon with specified sides.
     * @param args  sides of the Polygon
     */
    public Polygon(Double... args){
        sides = new ArrayList<>();
        for (Double side:args) {
            sides.add(side);
        }
    }

    /**
     * Get the sides of the Polygon.
     * @return  sides of the Polygon
     */
    public ArrayList<Double> getSides(){
        return sides;
    }

    /**
     * Describe Polygon as a String.
     * @return Polygon description as a String. This method will be overridden in
     * Triangle and Rectangle classes.
     */
    abstract public String toString();
}
