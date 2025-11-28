package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunction;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args) {
//
//        Circle c1=new Circle(5);
//        System.out.println(Circle.numberOfCircleInstance);
//        Circle c2=new Circle(10);
//        System.out.println(Circle.numberOfCircleInstance);
//        Circle c3=new Circle(2.5);
//        System.out.println(Circle.numberOfCircleInstance);
//        Circle c4=new Circle(7.7);
//        System.out.println(Circle.numberOfCircleInstance);
//        Circle c5=new Circle(1.1);
//        System.out.println(Circle.numberOfCircleInstance);
//
//        System.out.println(Util.circleToString(c1));
//        System.out.println(Util.circleToString(c2));
//        System.out.println(Util.circleToString(c3));
//        System.out.println(Util.circleToString(c4));
//        System.out.println(Util.circleToString(c5));
//    }
//}
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(3, 6);

        Triangle t1 = new Triangle(4, 5, 6, 3);

        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 1 perimeter: " + r1.getPerimeter());

        System.out.println("Triangle area: " + t1.getArea());
        System.out.println("Triangle perimeter: " + t1.getPerimeter());

    
        HelperFunction.compareRectangles(r1,r2);
    }
}
