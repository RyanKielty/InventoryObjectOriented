package com.company;

/**
 * Created by ryankielty on 11/22/16.
 */
public class Skydiving extends InventoryItem {
    public Skydiving(String item, int quantity, String uom) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Skydiving";
        this.uom = uom;
    }
}
