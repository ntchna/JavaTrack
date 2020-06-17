package view;



import exception.InvalidCompanyException;
import exception.InvalidMenuItemException;
import exception.InvalidTypeException;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Input {
    private Validator validator;
    private Scanner scanner;
    private static final int Wrong_Item= -1;
    private Output output;

    private static final Logger logger = Logger.getLogger(Input.class);

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
            logger.error("Error of inputing menu point:"+e.getMessage());
            output.showError(e.getMessage());

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
            logger.error("Error of inputing type of appliance:"+e.getMessage());
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
            logger.error("Error of inputing company of appliance:"+e.getMessage());
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
