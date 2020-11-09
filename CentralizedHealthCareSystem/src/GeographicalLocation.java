/**
 * GeographicalLocation class stores latitude and longitude for a location on earth.
 * @author Asma
 * @version 1.0
 */
public class GeographicalLocation {
    // stores latitude for location
    private double latitude;
    // stores longitude for location
    private double longitude;

    /**
     * Create a new GeographicalLocation with specific latitude and longitude
     * @param latitude latitude of the location
     * @param longitude longitude of the location
     */
    public GeographicalLocation(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * print geographical location (latitude and longitude)
     */
    public void printInfo(){}
}
