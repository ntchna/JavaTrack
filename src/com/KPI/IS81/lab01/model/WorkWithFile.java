package com.KPI.IS81.lab01.model;

import java.io.*;
import java.time.LocalDate;

public class WorkWithFile {
    public void writeDataToTextFile(HomeAppliances[] appliances, String filePath) {
        if (appliances.length == 0) {
            return;
        }
        try (FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)) {

            for (HomeAppliances homeAppliances: appliances) {

                bufferedWriter.write(homeAppliances.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    HomeAppliances[] readFromFile(String filePath, int numberOfAppliances) {
        HomeAppliances[] appliances = new HomeAppliances[numberOfAppliances];

        try (FileReader fileReader=new FileReader(filePath);
             BufferedReader bufferedReader=new BufferedReader(fileReader)) {
            for (int i=0; bufferedReader.read() != -1; i++) {
                String data=bufferedReader.readLine();
                String[] applianceData=data.split(" ;");
                appliances[i]=new HomeAppliances();
                appliances[i].setID(Integer.parseInt(applianceData[0]));
                appliances[i].setType(applianceData[1]);
                appliances[i].setModel(applianceData[2]);
                appliances[i].setName(applianceData[3]);
                appliances[i].setCompany(applianceData[4]);
                appliances[i].setQuantity(Integer.parseInt(applianceData[5]));
                appliances[i].setPrice(Float.parseFloat(applianceData[6]));
                appliances[i].setDate(LocalDate.parse(applianceData[7]));


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return appliances;
    }
}


