/**
 * Author: Alexandria Rose Noble
 * Date: March 29, 2026
 */
public class Penguin extends Bird {
    // Penguin-specific private fields
    private String species;
    private double flipperLength;

    // Overloaded constructor
    public Penguin(int sampleNum, String species, double culmenLength, 
                   double culmenDepth, double bodyMass, String sex, double flipperLength) {
        
        // Calls "super" to let the Bird class initialize shared fields
        super(sampleNum, culmenLength, culmenDepth, bodyMass, sex);
        
        // Initializes Penguin-specific fields using "this"
        this.species = species;
        this.flipperLength = flipperLength;
    }

    // Public getter methods for Penguin-specific fields
    public String getSpecies() { return species; }
    public double getFlipperLength() { return flipperLength; }
}
