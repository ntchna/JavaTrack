package exception;

import java.io.IOException;

public class InvalidMenuItemException extends IOException {
    public InvalidMenuItemException(String message) {
        super(message);
    }
}
