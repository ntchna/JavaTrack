package com.KPI.IS81.lab01.exception;

import java.io.IOException;

public class InvalidTypeException extends IOException {
    public InvalidTypeException(String message){
        super(message);
    }
}
