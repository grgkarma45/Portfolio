package org.example;

public class Jewelery extends Asset{
    double karat;

    public Jewelery(String name, double value, double karat) {
        super(name, value, karat);
    }
    @Override
    public double getValue() {
        return value;
    }
}
