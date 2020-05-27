package com.KPI.IS81.lab01.view;

        import java.util.Scanner;

public class Input {
    private Validator validator;
    private Scanner scanner;
    private static final int Wrong_Item= -1;

    public Input(){
        validator = new Validator();
        scanner = new Scanner(System.in);
    }

    public int getMenuPointForChoise(Output output) {
        String menuPoint;
        menuPoint = scanner.nextLine();
        if (Validator.isValidMenuPoint(menuPoint)) {
            return Integer.parseInt(menuPoint);
        } else {
            output.showMessage("Menu item is invalid, input another menu item");
            return Wrong_Item;
        }
    }

    public String  inputGivenType(Output output) {
        String givenType ;
        output.showMessage("Enter type to show appropriate appliances:");
        givenType = scanner.nextLine();
        if (Validator.isValidGivenType(givenType)){
            return givenType;
        } else {
            return String.valueOf(Wrong_Item);
        }
    }



    public String inputGivenCompany(Output output) {
        String givenCompany;
        output.showMessage("Enter name of company to show appropriate appliances:");
        givenCompany = scanner.nextLine();
        if (Validator.isValidGivenType(givenCompany)){
            return givenCompany;
        } else {
            return String.valueOf(Wrong_Item);
        }
    }
}
