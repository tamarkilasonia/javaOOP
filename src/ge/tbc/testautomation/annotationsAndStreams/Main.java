
package ge.tbc.testautomation.annotationsAndStreams;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Analyzable a = new Analyzable();
        Field[] fields = Analyzable.class.getDeclaredFields();

        List<Field> matching = Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(f -> {
                    VariableNameAnnotation ann = f.getAnnotation(VariableNameAnnotation.class);
                    return f.getName().equals(ann.name());
                })
                .collect(Collectors.toList());

        List<Field> nonMatching = Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(VariableNameAnnotation.class))
                .filter(f -> {
                    VariableNameAnnotation ann = f.getAnnotation(VariableNameAnnotation.class);
                    return !f.getName().equals(ann.name());
                })
                .collect(Collectors.toList());

        System.out.println("Matching fields");
        matching.forEach(f -> System.out.println(" - " + f.getName()));


        System.out.println("Non-matching fields");
        nonMatching.forEach(f -> System.out.println(" - " + f.getName() + " (annotation=\"" + f.getAnnotation(VariableNameAnnotation.class).name() + "\")"));

        @SuppressWarnings("unused")
        int unusedInt = 19;

        @SuppressWarnings("unused")
        String unusedStr = "keep";

        @SuppressWarnings("unused")
        Object unusedObj = new Object();

    }
}
