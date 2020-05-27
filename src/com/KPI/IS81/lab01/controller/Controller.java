package com.KPI.IS81.lab01.controller;

import com.KPI.IS81.lab01.model.Sevice;
import com.KPI.IS81.lab01.view.Input;
import com.KPI.IS81.lab01.view.Output;

public class Controller {
    private Sevice sevice;
    private Output output;

    public Controller(){
        output = new Output();
        sevice = new Sevice();
    }

    public void run(){
        do{
            output.viewMenu();
            switch (output.getMenuPoint()){
                case 1:
                    output.displayAppliances(sevice.getAppliances());
                break;
                case 2:
                    output.displayAppliances(sevice.getNameWhithGivenType(output.getGivenType()));
                break;
                case 3: output.displayAppliances(sevice.getNameWhithSmallPrise());
                break;
                case 4:
                    output.displayAppliances(sevice.getNameWhithGivenCompany(output.getGivenCompany()));
                break;
                case 5: System.exit(1);
            }
        }while (true);
    }
}
