package exceptions;

public class WrongLoginException extends IllegalArgumentException {
    public WrongLoginException(String error) {
        super(error);
    }

}
