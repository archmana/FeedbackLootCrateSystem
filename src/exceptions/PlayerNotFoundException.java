package exceptions;

// costume exception til spiller ikke fundet
public class PlayerNotFoundException extends Exception {
    public PlayerNotFoundException() {
        super("Player Not Found Error: ");
    }
}
