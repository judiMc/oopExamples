package oointro;

public class DivisionByZeroException extends ArithmeticException { 
    public DivisionByZeroException() {
        super("Calculator: Cannot divide by zero.");
    }
}