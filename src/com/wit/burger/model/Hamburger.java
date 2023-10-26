package com.wit.burger.model;

import com.wit.burger.enums.Bread;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private Bread breadRollType;

    public Hamburger(String name, String meat, double price, Bread breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bread getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(Bread breadRollType) {
        this.breadRollType = breadRollType;
    }
}
