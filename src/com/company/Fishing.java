package com.company;

/**
 * Created by ryankielty on 11/22/16.
 */
public class Fishing extends InventoryItem {
    public Fishing(String item, int quantity, String uom) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Fishing";
        this.uom = uom;
    }
}
