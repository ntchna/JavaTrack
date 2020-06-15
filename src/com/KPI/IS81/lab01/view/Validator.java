package com.KPI.IS81.lab01.view;

import com.KPI.IS81.lab01.exception.InvalidCompanyException;
import com.KPI.IS81.lab01.exception.InvalidFilePathExeption;
import com.KPI.IS81.lab01.exception.InvalidMenuItemException;
import com.KPI.IS81.lab01.exception.InvalidTypeException;

public class Validator {
    public static void isValidMenuPoint(String menuPoint) throws InvalidMenuItemException {
        if (!menuPoint.matches("[1-5]")) {
            throw new InvalidMenuItemException("Menu item '"+menuPoint+"' doesn't exist. Please, input another one.");
        }
    }

    public static void isValidGivenType( String givenType) throws InvalidTypeException {
       if (!givenType.matches("[a-zA-Z]*(?i).*")){
           throw new InvalidTypeException("'"+givenType+"'  is invslid. Please, try again.");
       }
    }

    public static void isValidGivenCompany(String givenCompany)throws InvalidCompanyException{
        if (!givenCompany.matches("[a-zA-Z]*(?i).*")) {
            throw new InvalidCompanyException("'"+givenCompany+"' is invalid. Please, try again.");
        }
    }

    public static boolean validateFilepath(String filePath) {
        return filePath.matches("([a-zA-Z]:(\\w+)*\\[a-zA-Z0_9]+)?.*");
    }
    public static boolean isValidKey(String key){
        return key.equals("Y") || key.equals("y") ||
                key.equals("yes") || key.equals("YES") ||
                key.equals("N") || key.equals("n") ||
                key.equals("no") || key.equals("NO");
    }
}
