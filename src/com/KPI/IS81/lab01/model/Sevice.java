package com.KPI.IS81.lab01.model;

import com.KPI.IS81.lab01.view.Validator;

import java.util.Arrays;

public class Sevice {
    private HomeAppliances[] appliances;

    public HomeAppliances[] getAppliances() {
        return appliances;
    }

   public Sevice() {
         appliances = DataSource.generateAppliances();
   }

    public HomeAppliances[] getNameWhithSmallPrise() {
        HomeAppliances[] filter = new HomeAppliances[appliances.length];

        int counter = 0;
        for(int i = 0; i < appliances.length; i++) {
            if (appliances[i].getPrice() <= 500) {
                filter[counter] = appliances[i];
                counter++;
            }
        }
        return Arrays.copyOf(filter, counter);
    }

    public HomeAppliances[] getNameWhithGivenType(String givenType) {
        HomeAppliances[] filter = new HomeAppliances[appliances.length];
        int counter = 0;
        if (Validator.isValidGivenCompany(givenType)) {

            for (int i = 0; i < appliances.length; i++) {
                if (appliances[i].getType().equals(givenType)) {
                    filter[counter] = appliances[i];
                    counter++;
                }

            }
        }
        return Arrays.copyOf(filter, counter);
    }

    public HomeAppliances[] getNameWhithGivenCompany(String givenCompany) {
        HomeAppliances[] filter = new HomeAppliances[appliances.length];
        int counter = 0;
        if (Validator.isValidGivenCompany(givenCompany)) {

            for (int i = 0; i < appliances.length; i++) {
                if (appliances[i].getCompany().equals(givenCompany)) {
                    filter[counter] = appliances[i];
                    counter++;
                }

            }
        }
        return Arrays.copyOf(filter, counter);
    }

}
