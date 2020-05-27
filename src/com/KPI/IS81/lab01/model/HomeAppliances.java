package com.KPI.IS81.lab01.model;

import java.time.LocalDate;

public class HomeAppliances {
    private int ID;
    private String type;
    private String model;
    private String name;
    private String company;
    private int quantity;
    private float price;
    private LocalDate date;

    @Override
    public String toString() {
        return ID+"\t"+type+"\t"+ model+"\t"+name+"\t"
                +company+"\t"+quantity+"\t"+price+"\t"+date+"\n";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID=ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company=company;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date=date;
    }
}
