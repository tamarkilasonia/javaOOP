package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.containers.Circle;
import ge.tbc.testautomation.containers.Rectangle2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnyPair<Field[], Field[]> fields = getDeclaredFields(19, "Tamari");
        System.out.println(Arrays.asList(fields.getElementOne()));
        System.out.println(Arrays.asList(fields.getElementTwo()));


        Circle c= new Circle(5);
        Rectangle2 r=new Rectangle2(4,9);
        FigurePair<Circle,Rectangle2> pair=new FigurePair<>(c,r);
        System.out.println(pair);
    }

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

Circle c= new Circle(5);
    Rectangle2 r=new Rectangle2(4,9);
    FigurePair<Circle,Rectangle2> pair=new FigurePair<>(c,r);


    }

