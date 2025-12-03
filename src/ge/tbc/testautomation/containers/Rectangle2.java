package ge.tbc.testautomation.containers;

public class Rectangle2 {

int width;
int heigh;

public Rectangle2(int width, int heigh){
    this.width=width;
    this.heigh=heigh;

    }
    public int getArea(){
    return width*heigh;

    }

    @Override
    public String toString() {
        return "(" + width + "x" + heigh + ")";
    }
}
