package ge.tbc.testautomation.javaoop.figures;

public class Circle {
    private double radius;
    public static int numberOfCircleInstance = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstance++;

    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}