package com.company;

/**
 * Created by ryankielty on 11/22/16.
 */
public class Snorkeling extends InventoryItem {
    public Snorkeling(String item, int quantity, String uom) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Snorkeling";
        this.uom = uom;
    }
}
