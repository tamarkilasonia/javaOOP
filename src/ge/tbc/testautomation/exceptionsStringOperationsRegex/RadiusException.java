package ge.tbc.testautomation.exceptionsStringOperationsRegex;
// exception for invalid radius values
// Thrown when a circle is created with radius <= 0
public class RadiusException extends RuntimeException{
    // Constructor that takes an error message
    public RadiusException(String message) {
        super(message); // Pass message to parent RuntimeException class
    }
}
