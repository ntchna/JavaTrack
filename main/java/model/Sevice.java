package model;


import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Sevice {
    private HomeAppliances[] appliances;
    private final WorkWithFile workWithFile;


    public HomeAppliances[] getAppliances() {
        return appliances;
    }

    public Sevice() {
        workWithFile = new WorkWithFile();
    }

    public void setAppliances() throws FileNotFoundException, IOException{
        int numberOfAppliances = 10;
        appliances=workWithFile.readFromFile("C:\\Users\\ntchn\\IdeaProjects\\lab05\\DataSource.txt", numberOfAppliances);
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
             for (int i = 0; i < appliances.length; i++) {
                if (appliances[i].getType().equals(givenType)) {
                    filter[counter] = appliances[i];
                    counter++;
                }

            }
        return Arrays.copyOf(filter, counter);
    }

    public HomeAppliances[] getNameWhithGivenCompany(String givenCompany) {
        HomeAppliances[] filter = new HomeAppliances[appliances.length];
        int counter = 0;
            for (int i = 0; i < appliances.length; i++) {
                if (appliances[i].getCompany().equals(givenCompany)) {
                    filter[counter] = appliances[i];
                    counter++;
                }

            }
        return Arrays.copyOf(filter, counter);
    }

    public void saveResult(HomeAppliances[] appliances, String filePath) throws IOException {
        workWithFile.writeDataToTextFile(appliances, filePath);
    }
}
