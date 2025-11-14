package exceptions;

// costume exception til utilstrækkelige credits
public class NotEnoughCreditException extends Exception {
    public NotEnoughCreditException() {
        super("Not Enough Credit Error: ");
    }
}
