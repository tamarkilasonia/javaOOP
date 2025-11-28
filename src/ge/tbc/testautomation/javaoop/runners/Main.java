package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.abstractclassesinterfaces.Circle;
import ge.tbc.testautomation.abstractclassesinterfaces.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle length: " + c.getLength());
        c.printPackageName();
        System.out.println("Circle valid: " + c.validateFigure());

        c.doubleSize();
        System.out.println("Circle area after doubleSize: " + c.getArea());

        c.customSize(1.5);
        System.out.println("Circle area after customSize(1.5): " + c.getArea());


        Triangle t = new Triangle(2, 3, 4);
        System.out.println("Triangle area: " + t.getArea());
        t.printPackageName();
        System.out.println("Triangle valid: " + t.validateFigure());

        t.doubleSize();
        System.out.println("Triangle area after doubleSize: " + t.getArea());

        t.customSize(0.5);
        System.out.println("Triangle area after customSize(0.5): " + t.getArea());


















        System.out.println("Main branch change");

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
//
        // Test RadiusException with negative radius
        System.out.println("=== Testing RadiusException with negative radius ===");
        try{
            // Create circle with negative radius - this should throw RadiusException
            Circle circleWithNegativeRadius= new Circle(-5.0);

        } catch (RadiusException e){
            // Catch the exception and print its message
            System.out.println("Caught RadiusException:" + e.getMessage());
        }

        // Test LimitException by creating multiple instances
        System.out.println("\n=== Testing LimitException with multiple instances ===");
        try {
            // Create multiple circles until we hit the limit of 5
            System.out.println("Hotfix branch change");
            for (int i = 1; i <= 10; i++) {
                Circle circle = new Circle(i * 1.0); // Valid radius, but will hit limit after 5th instance
                System.out.println("Successfully created circle " + i + " with radius: " + circle.getRadius());
            }
        } catch (LimitException e) {
            // Catch the limit exception
            System.out.println("Caught LimitException: " + e.getMessage());
        } catch (RadiusException e) {
            // Catch any radius exceptions (shouldn't happen here since radii are positive)
            System.out.println("Caught RadiusException: " + e.getMessage());
        }

        //  String operations
        System.out.println("\n=== String Operations ===");
        String text = "Test Automation Bootcamp 12, 2025";

        // Extract "Automation" and convert to lowercase
        String automationWord = text.substring(5, 15).toLowerCase();
        System.out.println("Automation in lowercase: " + automationWord);

        // Split text into words and print each on separate line
        System.out.println("\nWords in the text (one per line):");
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // Print text length
        System.out.println("\nText length: " + text.length());

// Replace spaces with dashes
String textWithDashes = text.replace(" ", "-");
System.out.println("Text with dashes: " + textWithDashes);

//  Phone number validation
System.out.println("\n=== Phone Number Validation ===");

// Array of phone numbers to test (mix of valid and invalid)
String[] phoneNumbers = {
        "599-14-15-16",  // Valid - starts with 599, has 6 digits after
        "555-12-34-56",  // Valid - starts with 555, has 6 digits after
        "595-99-88-77",  // Valid - starts with 595, has 6 digits after
        "592-00-11-22",  // Valid - starts with 592, has 6 digits after
        "599-1A-23-45",  // Invalid - contains letter 'A'
        "555-123-456",   // Invalid - wrong format (only 7 digits after prefix)
        "599-14-15",     // Invalid - too short (only 5 digits after prefix)
        "555-12-34-56-78", // Invalid - too long (8 digits after prefix)
        "123-45-67-89",  // Invalid - wrong prefix (123)
        "599-14-15-1A"   // Invalid - contains letter 'A' at the end
};

// Test each phone number
for (String phoneNumber : phoneNumbers) {
    boolean isValid = phoneNumberValidation(phoneNumber);
    System.out.println("Phone number '" + phoneNumber + "' is valid: " + isValid);
}

// Keep the rectangle comparison from main branch
HelperFunction.compareRectangles(r1, r2);
}

private static boolean phoneNumberValidation(String phoneNumber) {
    // Remove all dashes from the phone number
    String cleanedNumber = phoneNumber.replace("-", "");

    // Pattern explained:
    String regex = "^(555|595|592|599)[0-9]{6}$";

    return cleanedNumber.matches(regex);
}
}

    }
}
