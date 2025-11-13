package exceptions;

public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException() {
        super("Negative Amount Error: ");
    }
}
