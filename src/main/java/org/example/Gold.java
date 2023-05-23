package org.example;

public class Gold extends Asset{
    double weight;

    private Gold(String name, double value,double weight) {
        super(name, value);
        this.weight = weight;
    }

    public Gold(double weight) {
        this("Gold",weight * 1980,weight);
    }

    @Override
    public double getValue() {
        return weight * 1980;
    }

}

