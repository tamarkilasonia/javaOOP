package ge.tbc.testautomation.exceptionsStringOperationsRegex;

//exception for instantiation limit violations
//Thrown when trying to create more than 5 Circle instances

public class LimitException extends RuntimeException {
    public LimitException(String messange){
        // Constructor that takes an error message
        super(messange); // Pass message to parent RuntimeException class
        
    }
}

