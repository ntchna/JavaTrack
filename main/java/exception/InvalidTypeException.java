package exception;

import java.io.IOException;

public class InvalidTypeException extends IOException {
    public InvalidTypeException(String message){
        super(message);
    }
}
