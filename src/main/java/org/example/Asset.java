package org.example;

public abstract class Asset {
    private String name;
    public double value;
    public Asset(String name, double value) {
        this.name = name;
        this.value = value;

    }
    public double getValue() {
        return  value;
    }
}
