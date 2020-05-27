package com.KPI.IS81.lab01.view;

import com.KPI.IS81.lab01.model.HomeAppliances;


public class Output {

    private Input input;


    public Output(){
        input = new Input();
    }

    public void showMessage(String string){
        System.out.println(string);
    }

    public void viewMenu(){
        System.out.println(("Menu"));
        System.out.println("1. Show a list of all home appliances");
        System.out.println("2. Show a list of home appliances of a given type");
        System.out.println("3. Show a list of home appliances with price less than 500UAH");
        System.out.println("4. Show a list of home appliances for a given company");
        System.out.println("5. Exit");
    }

    public int getMenuPoint(){
        int menuPoint;
        while (true) {
            menuPoint = input.getMenuPointForChoise(this);
            if (menuPoint != -1)
                return menuPoint;
        }
    }

    public String getGivenType(){
        String  givenType;
        while (true){
            givenType = input.inputGivenType(this);
            if(givenType.length() != -1)
            return givenType;
        }
    }

   public String getGivenCompany(){
        String givenCompany;
        while (true){
            givenCompany = input.inputGivenCompany(this);
            if(givenCompany.length() != -1)
            return givenCompany;
        }
   }

    public void displayAppliances (HomeAppliances[] appliances){
        if (appliances.length == 0){
            System.out.println("no appliances");
        }else {
            System.out.println("ID\tType\tModel\tName\tCompany\tQuantity\tPrice\tDate\n");
            for (HomeAppliances homeAppliances : appliances) {
                System.out.println(homeAppliances);
            }
        }
    }
/*
    public void formatedView (HomeAppliances [] homeAppliances){
        int counter = 0;
        //homeAppliances[0] = String.format("%-5d", HomeAppliances.toString(ID));
        for (int i = 0; i < homeAppliances.length; i++){
            HomeAppliances.toString(homeAppliances[i]);
            homeAppliances[i] += String.format("%-5d || %-30s || %-16s || %-30s || %-11s || %-4d || %-6d || %-10tD %n", ID, type, model, name, company, quantity, price, date);
            //System.out.printf("ID%-5d\Type%-30s\Model%-16s\Name%-30s\Company%-11s\Quantity%-4d\Price%-6d\Date%-10tD%n", appliances[i] );
            counter++;
        }
    }*/
}
