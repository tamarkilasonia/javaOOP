package ge.tbc.testautomation.abstractclassesinterfaces;

import ge.tbc.testautomation.abstractclassesinterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractclassesinterfaces.interfaces.IValidFigure;

public  class Triangle extends Figure implements IResizable, IValidFigure {
    private double a,b,c;

    public Triangle(double a,double b,double c){
this.a=a;
this.b=b;
this.c=c;
    }

    @Override
    public double getArea() {
        // Using Heron's formula
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        a *= 2; b *= 2; c *= 2;
    }

    @Override
    public void customSize(double byValue) {
        a *= byValue; b *= byValue; c *= byValue;
    }

    @Override
    public boolean validateFigure() {
        boolean valid = a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;

        if (!valid)
            System.out.println("Invalid triangle sides.");

        return valid;
    }
    }
