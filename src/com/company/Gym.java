package com.company;

/**
 * Created by ryankielty on 11/22/16.
 */
public class Gym extends InventoryItem {
    public Gym(String item, int quantity, String uom) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Gym";
        this.uom = uom;
    }
}

