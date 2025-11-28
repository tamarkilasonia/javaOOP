package ge.tbc.testautomation.javaoop.figures;

public class Figure {
    // Static variable to count how many Figure objects are created
    // This variable is shared across all instances of the Figure class
    public static int numberOfInstances = 0;

    // Constructor - automatically called when creating any Figure object
    public Figure() {
        // Increase the counter every time a new Figure is created
        numberOfInstances++;
    }

    public double getArea() {

     return -1.0;
      }

    public double getPerimeter() {

     return -1.0;
       }
}
