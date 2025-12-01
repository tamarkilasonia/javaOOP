package ge.tbc.testautomation.abstractclassesinterfaces;

import ge.tbc.testautomation.abstractclassesinterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractclassesinterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if(!validateFigure()) {
            throw new IllegalArgumentException("Invalid circle radius");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    // IResizable
    @Override
    public void doubleSize() {
        radius *= 2;
    }

    @Override
    public void customSize(double byValue) {
        radius *= byValue;
    }

    // IValidFigure
    @Override
    public boolean validateFigure() {
        return radius > 0;
    }
}
