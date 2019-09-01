package greencity.exception;


/**
 * Exception that we get when in some logic we have bad ID.
 *
 * @author Nazar Stasyuk
 * @version 1.0
 */
public class BadIdException extends RuntimeException {
    public BadIdException(String message) {
        super(message);
    }
}