package com.KPI.IS81.lab01.controller;

import com.KPI.IS81.lab01.model.HomeAppliances;
import com.KPI.IS81.lab01.model.Sevice;
import com.KPI.IS81.lab01.view.Output;

public class Controller {
    private Sevice sevice;
    private Output output;

    public Controller(){
        output = new Output();
        sevice = new Sevice();

    }

    public void run(){
        sevice.setAppliances();
        do{
            output.viewMenu();
            switch (output.getMenuPoint()){
                case 1:
                    output.displayAppliances(sevice.getAppliances());
                    output.showMessage("\n");
                break;
                case 2:
                    HomeAppliances[] givenNameAppliances = sevice.getNameWhithGivenType(output.getGivenType());
                    output.displayAppliances(givenNameAppliances);
                    output.showMessage("\n");
                    sevice.saveResult(givenNameAppliances, output.getFilePath());
                    output.showMessage("\n");
                break;
                case 3:
                    HomeAppliances[] appliancesWithSmallPrise = sevice.getNameWhithSmallPrise();
                    output.displayAppliances(appliancesWithSmallPrise);
                    output.showMessage("\n");
                    sevice.saveResult(appliancesWithSmallPrise, output.getFilePath());
                    output.showMessage("\n");
                break;
                case 4:
                    HomeAppliances[] givenCompanyAppliances = sevice.getNameWhithGivenCompany(output.getGivenCompany());
                    output.displayAppliances(givenCompanyAppliances);
                    output.showMessage("\n");
                    sevice.saveResult(givenCompanyAppliances, output.getFilePath());
                    output.showMessage("\n");
                break;
                case 5: System.exit(1);
            }
        }while (true);
    }
}
