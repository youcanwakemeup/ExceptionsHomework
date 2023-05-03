package exceptions;

public class WrongPasswordException extends IllegalArgumentException {
    public WrongPasswordException(String error) {
        super(error);
    }
}
