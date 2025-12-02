package ge.tbc.testautomation.containers;

import java.util.Comparator;

public class ReverseRectangleComparator implements Comparator<Rectangle2> {

    @Override
    public int compare(Rectangle2 r1, Rectangle2 r2) {
        int area1 = r1.getArea();
        int area2 = r2.getArea();


        return Integer.compare(area2, area1);
    }
}
