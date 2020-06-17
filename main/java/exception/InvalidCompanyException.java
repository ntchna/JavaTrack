package exception;

import java.io.IOException;

public class InvalidCompanyException extends IOException {
    public InvalidCompanyException(String message){
        super(message);
    }
}
