package org.example;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    String name;
    String owner;
    private ArrayList<Asset> assets;

    public Portfolio(String name, String owner, ArrayList<Asset> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public static void main(String[] args) {
        ArrayList<Asset> asset = new ArrayList<Asset>();
        asset.add(new Gold(17));
        asset.add(new Jewelery("Grandma's Wedding ring",))
    }
}

