package mprofile.core.services.exception;

/**
 * Created by Chris on 6/30/14.
 */
public class UserDoesNotExistException extends RuntimeException {
    public UserDoesNotExistException(Throwable cause) {
        super(cause);
    }

    public UserDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserDoesNotExistException(String message) {
        super(message);
    }

    public UserDoesNotExistException() {
    }
}
