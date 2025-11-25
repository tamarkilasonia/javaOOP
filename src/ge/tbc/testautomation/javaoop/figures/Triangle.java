package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figure {
    double a;
    double b;
    double c;
    double h;


    public Triangle(double a, double b, double c, double h) {
        this.a = a;  // base (the side on which the height falls)
        this.b = b;  // second side
        this.c = c;  // third side
        this.h = h;  // height
    }

    @Override
    public double getArea() {
return (a*h)/2;
    }

    @Override
    public double getPerimeter() {
     return a+b+c;
    }
}