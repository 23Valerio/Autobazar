package com.company;

public class Car {
    String brand  = " ";       // car brand
    String model = " ";       // car model
    int price = 0;           // car price
    int consuption = 0;      // average consumption
    boolean carSold = false; // whether the car is sold
    Owner carOwner;

    public Owner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(Owner carOwner) {
        this.carOwner = carOwner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getConsuption() {
        return consuption;
    }

    public void setConsuption(int consuption) {
        this.consuption = consuption;
    }

    public boolean isCarSold() {
        return carSold;
    }

    public void setCarSold(boolean carSold) {
        this.carSold = carSold;
    }
}
