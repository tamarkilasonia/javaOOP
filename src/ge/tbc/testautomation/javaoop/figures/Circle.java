package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figure {
    private double radius;


    public Circle(double radius) {
        super(); // Call parent constructor to increment instance counter

        // Check if we have exceeded the maximum allowed instances (5)

        if(Figure.numberOfInstances >5){
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }

        // Validate that radius is a positive number
        if(radius <= 0){
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        // Validate the new radius value before setting it
        if (radius <= 0){
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
        this.radius = radius;
    }
}