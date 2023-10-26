package com.wit.burger.enums;

public enum Bread {

    SW ("Sandwich",3.00),
    WR ("Wrap",200),
    DSW ("Double Sandwich", 4.00);

    public final String name;
    public final double size;

    Bread(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }
}
