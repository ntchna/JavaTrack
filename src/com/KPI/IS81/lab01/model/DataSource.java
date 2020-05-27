package com.KPI.IS81.lab01.model;

import java.time.LocalDate;
import java.util.Random;

public class DataSource {
    private static final Random random = new Random();

    private static int generateNamber(int min, int max){
        return random.nextInt((max-min)+1)+min;
    }

    public static HomeAppliances[] generateAppliances(){
        HomeAppliances[] entities = new HomeAppliances[10];
        for (int i=0; i < entities.length; i++) {
            entities[i]=randomAppliances();
        }
        return entities;
    }

    static HomeAppliances randomAppliances() {
           HomeAppliances homeAppliances = new HomeAppliances();

           homeAppliances.setID(generateNamber(44444, 80000));
           String[] type = {"Large home appliances", "Built-in appliances", "Kitchen appliances", "For home and clothes", "Health and beauty", "Air conditioning equipment", "Filters for water", "Instrumentations"};
           homeAppliances.setType(type[(generateNamber(0, type.length - 1))]);
           String[] model = {"Refrigerator", "freezer", "coffee machine", "vacuum cleaner", "iron", "hair dryers", "Boilers", "filters", "Water meter", "Air conditioners"};
           homeAppliances.setModel(model[(generateNamber(0, model.length - 1))]);
           String[] name = {"KGN39VI306", "GP 1213 Frost Protect", "PrimaDonnaECAM 510.55.M", "Swift Power Cyclonic RO2932EA", "Access Easy FV1543", "DryCare BHD030/00", "ATLANTIC OPRO Sample(N4L)", "WF-HOT-SS-10 3/4", "GROSS MTK-UA 50 F", "ARN07HQMUA"};
           homeAppliances.setName(name[(generateNamber(0, name.length - 1))]);
           String[] company = {"Philips", "Bosch", "Electrolux", "Samsung", "LG", "HYUNDAI "};
           homeAppliances.setCompany(company[(generateNamber(0, company.length - 1))]);
           homeAppliances.setQuantity(generateNamber(10, 444));
           homeAppliances.setPrice(generateNamber(150, 2500));
           LocalDate [] date = {LocalDate.parse("2018-11-27"), LocalDate.parse("2019-10-07"), LocalDate.parse("2019-03-20"), LocalDate.parse("2019-12-15"), LocalDate.parse("2019-07-26"), LocalDate.parse("2010-09-09"), LocalDate.parse("2019-04-24"), LocalDate.parse("2018-12-28")};
           homeAppliances.setDate( date [(generateNamber(0, date.length - 1))]);

           return  homeAppliances;
    }

}
