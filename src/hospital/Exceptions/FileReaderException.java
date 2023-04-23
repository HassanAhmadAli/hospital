package hospital.Exceptions;
// import class exception
import java.io.IOException;

public class FileReaderException extends IOException {
    // create constructor
    public FileReaderException(String message) {
        super(message);
    }
    public FileReaderException(){super();}
}