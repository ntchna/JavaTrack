package com.KPI.IS81.lab01.view;

        import com.KPI.IS81.lab01.exception.InvalidCompanyException;
        import com.KPI.IS81.lab01.exception.InvalidMenuItemException;
        import com.KPI.IS81.lab01.exception.InvalidTypeException;

        import java.util.Scanner;

public class Input {
    private Validator validator;
    private Scanner scanner;
    private static final int Wrong_Item= -1;
    private Output output;

    public Input(){
        validator = new Validator();
        scanner = new Scanner(System.in);
    }

    public int getMenuPointForChoise(Output output) {
        String menuPoint;
        menuPoint = scanner.nextLine();
        try{
            validator.isValidMenuPoint(menuPoint);
        }
        catch (InvalidMenuItemException e) {
            output.showError(e.getMessage());
            return Wrong_Item;
        }
        return Integer.parseInt(menuPoint);
    }

    public String  inputGivenType(Output output) {
        String givenType ;
        output.showMessage("Enter type to show appropriate appliances:");
        givenType = scanner.nextLine();
        try {
            Validator.isValidGivenType(givenType);
        }
        catch (InvalidTypeException e){
            output.showError(e.getMessage());
        }
        return givenType;

    }

    public String inputGivenCompany(Output output) {
        String givenCompany;
        output.showMessage("Enter name of company to show appropriate appliances:");
        givenCompany = scanner.nextLine();
        try {
            Validator.isValidGivenCompany(givenCompany);
        }
        catch (InvalidCompanyException e) {
            output.showError(e.getMessage());
        }
        return givenCompany;

    }

    public String inputFilePath (Output output){
        do{
            String filePath;
            output.showMessage("Where do you want to save it?");
            filePath=scanner.nextLine();
            if(Validator.validateFilepath(filePath)) {
                return filePath;
            }
            else output.showMessage("Input another file path");
        }while (true);
    }
}
