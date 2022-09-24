package oointro;

public class ValueOverflowException extends RuntimeException {
    public ValueOverflowException() {
        super("Calculator: Maximum value reached.");
    }
}