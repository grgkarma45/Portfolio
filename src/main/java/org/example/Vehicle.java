package org.example;

public class Vehicle extends Asset{
    public int year;
    public String make;
    public String model;
    public String condition;

    public Vehicle(String name, double value, double karat, int year, String make, String model, String condition) {
        super(name, value, karat);
        this.year = year;
        this.make = make;
        this.model = model;
        this.condition = condition;
    }

    @Override
    public double getValue() {
        return value;
    }

}
