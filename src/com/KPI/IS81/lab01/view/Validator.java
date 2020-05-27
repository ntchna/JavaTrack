package com.KPI.IS81.lab01.view;

public class Validator {
    static boolean isValidMenuPoint(String menuPoint){
        return menuPoint.matches("[1-5]");
    }

    static boolean isValidGivenType( String givenType){
       return givenType.matches("[a-zA-Z]*(?i).*");
    }

    public static boolean isValidGivenCompany(String givenCompany){
        return givenCompany.matches("[a-zA-Z]*(?i).*");
    }
}
