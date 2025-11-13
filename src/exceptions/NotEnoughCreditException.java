package exceptions;

public class NotEnoughCreditException extends Exception {
    public NotEnoughCreditException() {
        super("Not Enough Credit Error: ");
    }
}
