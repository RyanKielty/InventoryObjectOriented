package com.company;

/**
 * Created by ryankielty on 11/22/16.
 */
public class Camping extends InventoryItem {
    public Camping(String item, int quantity, String uom) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Camping";
        this.uom = uom;
    }
}
