package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.abstractclassesinterfaces.Circle;
import ge.tbc.testautomation.abstractclassesinterfaces.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle length: " + c.getLength());
        c.printPackageName();
        System.out.println("Circle valid: " + c.validateFigure());

        c.doubleSize();
        System.out.println("Circle area after doubleSize: " + c.getArea());

        c.customSize(1.5);
        System.out.println("Circle area after customSize(1.5): " + c.getArea());


        Triangle t = new Triangle(2, 3, 4);
        System.out.println("Triangle area: " + t.getArea());
        t.printPackageName();
        System.out.println("Triangle valid: " + t.validateFigure());

        t.doubleSize();
        System.out.println("Triangle area after doubleSize: " + t.getArea());

        t.customSize(0.5);
        System.out.println("Triangle area after customSize(0.5): " + t.getArea());
    }
}