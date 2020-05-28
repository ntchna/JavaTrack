package com.KPI.IS81.lab01.model;

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
        for (HomeAppliances appliance : appliances) {
            if (appliance.getPrice() <= 500) {
                filter[counter] = appliance;
                counter++;
            }
        }
        return Arrays.copyOf(filter, counter);
    }

    public HomeAppliances[] getNameWhithGivenType(String givenType) {
        HomeAppliances[] filter = new HomeAppliances[appliances.length];
        int counter = 0;
        for (HomeAppliances appliance : appliances) {
            if (appliance.getType().equals(givenType)) {
                filter[counter] = appliance;
                counter++;
            }

        }
        return Arrays.copyOf(filter, counter);
    }

    public HomeAppliances[] getNameWhithGivenCompany(String givenCompany) {
        HomeAppliances[] filter = new HomeAppliances[appliances.length];
        int counter = 0;
        for (HomeAppliances appliance : appliances) {
            if (appliance.getCompany().equals(givenCompany)) {
                filter[counter] = appliance;
                counter++;
            }

        }
        return Arrays.copyOf(filter, counter);
    }

}
