package com.KPI.IS81.lab01.exception;

import java.io.IOException;

public class InvalidMenuItemException extends IOException {
    public InvalidMenuItemException(String message) {
        super(message);
    }
}
