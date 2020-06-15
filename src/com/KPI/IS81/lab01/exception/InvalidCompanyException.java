package com.KPI.IS81.lab01.exception;

import java.io.IOException;

public class InvalidCompanyException extends IOException {
    public InvalidCompanyException(String message){
        super(message);
    }
}
