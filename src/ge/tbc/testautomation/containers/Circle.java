package ge.tbc.testautomation.containers;

import java.util.Objects;

public class Circle implements Comparable<Circle>{
    private double radius;


    public Circle (double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public int compareTo(Circle other) {
        if(this.radius>other.radius) return 1;
        if(this.radius<other.radius) return -1;
        return 0;

    }
//I add this because without these methods, HashSet would treat circles with the same radius as different objects and would not remove duplicates

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
