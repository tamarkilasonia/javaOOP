package ge.tbc.testautomation.annotationsAndStreams;

import java.util.Arrays;
import java.util.Map;

public class Analyzable {

    @VariableNameAnnotation(name = "Name")
    public String Name = "Tamari";



    @VariableNameAnnotation(name = "Surname")
    public String surname = "Kilasonia";



    @VariableNameAnnotation(name = "anotherDouble")
    private double anotherDouble = 3.14;


    // No name provided, uses default value
    @VariableNameAnnotation
    protected boolean flag = true;


    @VariableNameAnnotation(name = "SomeList")
    java.util.List<String> someList = Arrays.asList("a", "b");


    @VariableNameAnnotation(name = "MapField")
    Map<String, Integer> mapField = java.util.Collections.emptyMap();


    @VariableNameAnnotation(name = "charField")
    char charField = 'c';


    @VariableNameAnnotation(name = "LongNumber")
    Long longNumber = 123L;


    @VariableNameAnnotation(name = "byteArray")
    byte[] byteArray = new byte[] { 1, 2 };


    @VariableNameAnnotation(name = "CustomObject")
    Object customObject = new Object();


    // one field where annotation name is something else (doesn't match variable name)
    @VariableNameAnnotation(name = "NotMatching")
    public String something = "StayPositive)";
}

