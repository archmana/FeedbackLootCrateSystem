package exceptions;

// costume exception til negative beløb
public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException() {
        super("Negative Amount Error: ");
    }
}
