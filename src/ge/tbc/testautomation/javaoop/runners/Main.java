package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String [] args){

        Circle c1=new Circle(5);
        System.out.println(Circle.numberOfCircleInstance);
        Circle c2=new Circle(10);
        System.out.println(Circle.numberOfCircleInstance);
        Circle c3=new Circle(2.5);
        System.out.println(Circle.numberOfCircleInstance);
        Circle c4=new Circle(7.7);
        System.out.println(Circle.numberOfCircleInstance);
        Circle c5=new Circle(1.1);
        System.out.println(Circle.numberOfCircleInstance);

        System.out.println(Util.circleToString(c1));
        System.out.println(Util.circleToString(c2));
        System.out.println(Util.circleToString(c3));
        System.out.println(Util.circleToString(c4));
        System.out.println(Util.circleToString(c5));
    }
}
