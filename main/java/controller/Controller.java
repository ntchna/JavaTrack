package controller;


import model.HomeAppliances;
import model.Sevice;
import org.apache.log4j.Logger;
import view.Output;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Controller {
    private Sevice sevice;
    private Output output;

    private static final Logger logger = Logger.getLogger(Controller.class);

    public Controller() {
        logger.debug("Programme started");
        output = new Output();
        sevice = new Sevice();

    }



    public void run(){
        try {
            sevice.setAppliances();
        } catch (FileNotFoundException e) {
            logger.fatal("No file for reading: "+e.getMessage());
            output.showError("No input file or its invalid (fatal error)");
            System.exit(1);
        } catch (IOException e) {
            logger.fatal("Problems with file reading: "+e.getMessage());
            output.showError("Error of reading data from file (fatal error)");
            System.exit(1);
        }
        do{
            output.viewMenu();
            switch (output.getMenuPoint()){
                case 1:
                    logger.info("User chose first menu item: Show a list of all home appliances");
                    output.displayAppliances(sevice.getAppliances());
                    output.showMessage("\n");
                break;
                case 2:
                    logger.info("User chose second menu item: Show a list of home appliances of a given type");
                    HomeAppliances[] givenNameAppliances = sevice.getNameWhithGivenType(output.getGivenType());
                    output.displayAppliances(givenNameAppliances);
                    output.showMessage("\n");
                    try {
                        sevice.saveResult(givenNameAppliances, output.getFilePath());
                    } catch (IOException e) {
                        logger.fatal("Problems with file writing: "+e.getMessage());
                        output.showError("Error of writing data into file(fatal error)");
                    }
                    output.showMessage("\n");
                break;
                case 3:
                    logger.info("User chose third menu item: Show a list of home appliances with price less than 500UAH");
                    HomeAppliances[] appliancesWithSmallPrise = sevice.getNameWhithSmallPrise();
                    output.displayAppliances(appliancesWithSmallPrise);
                    output.showMessage("\n");
                    try {
                        sevice.saveResult(appliancesWithSmallPrise, output.getFilePath());
                    } catch (IOException e) {
                        logger.fatal("Problems with file writing: "+e.getMessage());
                        output.showError("Error of writing data into file(fatal error)");
                    }
                    output.showMessage("\n");
                break;
                case 4:
                    logger.info("User chose fourth menu item: Show a list of home appliances for a given company");
                    HomeAppliances[] givenCompanyAppliances = sevice.getNameWhithGivenCompany(output.getGivenCompany());
                    output.displayAppliances(givenCompanyAppliances);
                    output.showMessage("\n");
                    try {
                        sevice.saveResult(givenCompanyAppliances, output.getFilePath());
                    } catch (IOException e) {
                        logger.fatal("Problems with file writing: "+e.getMessage());
                        output.showError("Error of writing data into file(fatal error)");
                    }
                    output.showMessage("\n");
                break;
                case 5:
                    logger.info("User chose 'Exit'. Programme finished successfully");
                    System.exit(1);
            }
        }while (true);
    }
}
