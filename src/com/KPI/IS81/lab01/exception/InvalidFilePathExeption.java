package com.KPI.IS81.lab01.exception;

import java.io.IOException;

public class InvalidFilePathExeption  extends IOException{

        public InvalidFilePathExeption(String message) {
            super(message);
        }

}
