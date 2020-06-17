package model;

import org.apache.log4j.Logger;

import java.io.*;
//import java.time.LocalDate;

public class WorkWithFile {

private static final Logger logger = Logger.getLogger(WorkWithFile.class);

    public void writeDataToTextFile(HomeAppliances[] appliances, String filePath) {
        if (appliances.length == 0) {
            return;
        }

        try {FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            logger.info("Writing data to the file");
            for (HomeAppliances homeAppliances: appliances) {
                bufferedWriter.write(homeAppliances.toString());
            }
        } catch (IOException e) {
            logger.error("Error of writing data into file");
            e.printStackTrace();
        }
    }


    HomeAppliances[] readFromFile(String filePath, int numberOfAppliances) {
        HomeAppliances[] appliances = new HomeAppliances[numberOfAppliances];

        try {FileReader fileReader=new FileReader(filePath);
             BufferedReader bufferedReader=new BufferedReader(fileReader);
            logger.info("Reading data from file");
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
                //appliances[i].setDate(LocalDate.parse(applianceData[7]));


            }
        } catch (FileNotFoundException e) {
            logger.error("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("Error of reading data from file");
            e.printStackTrace();
        }

        return appliances;
    }
}


