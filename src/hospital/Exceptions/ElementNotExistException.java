package hospital.Exceptions;

public class ElementNotExistException extends Exception {
    public ElementNotExistException() {
    }


    public ElementNotExistException(String message) {
        super(message);
    }
}