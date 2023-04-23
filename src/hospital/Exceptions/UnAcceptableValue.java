package hospital.Exceptions;

public class UnAcceptableValue extends Exception{
    public UnAcceptableValue() {
        super();
    }

    public UnAcceptableValue(String message) {
        super(message);
    }
}
