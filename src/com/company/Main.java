package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<InventoryItem> onhand = new ArrayList<>();

    public static InventoryItem createItem(String item, int quantity, String category, String uom) {
        if (category.equalsIgnoreCase("Camping")) {
            Camping hiking = new Camping(item, quantity, uom);
            return hiking;
        } else if (category.equalsIgnoreCase("Gym")) {
            Gym gym = new Gym(item, quantity, uom);
            return gym;
        } else if (category.equalsIgnoreCase("Skydiving")) {
            Skydiving skydiving = new Skydiving(item, quantity, uom);
            return skydiving;
        } else if (category.equalsIgnoreCase("Snorkeling")) {
            Snorkeling snorkeling = new Snorkeling(item, quantity, uom);
            return snorkeling;
        } else if (category.equalsIgnoreCase("Fishing")) {
            Fishing fishing = new Fishing(item, quantity, uom);
            return fishing;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Listing:\n");
            int i = 1;
            for (InventoryItem inventory : onhand) {
                String qty = ": " + inventory.quantity;
                String cat = inventory.category + " >> ";
                String uom = " - " + inventory.uom;

//for each item in format string, an argument is need outside of " "
                System.out.printf("[%d] %s %s %s %s\n", i, cat, inventory.item, qty, uom);
                i = i + 1;
            }
            System.out.println("\nInventory Options:\n" +
                    "\n[1] Add a new item to listing" +
                    "\n[2] Remove an item from listing" +
                    "\n[3] Add quantity to inventory item" +
                    "\n[4] Remove quantity inventory item\n");
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("\nWhich listing would you like to add an item to?\n" +
                        "\n> Camping" +
                        "\n> Gym" +
                        "\n> Skydiving" +
                        "\n> Snorkeling" +
                        "\n> Fishing\n");
                String category = scanner.nextLine();
                System.out.println("\nWhat item would you like to add to inventory\n");
                String inventory = scanner.nextLine();
                System.out.println("\nWhat will be the initial quantity: \n");
                int add = Integer.parseInt(scanner.nextLine());
                System.out.println("\nWhat is the Unit of Measurement (UOM):\n" +
                        "\n> bx" +
                        "\n> each" +
                        "\n> feet" +
                        "\n> lb" +
                        "\n> oz" +
                        "\n> pair" +
                        "\n> yds\n");
                String uom = scanner.nextLine();
                System.out.println("\n");
                onhand.add(createItem(inventory, add, category, uom));

            } else if (option.equals("2")) {
                System.out.println("\nWhich item number would you like to remove from inventory:\n");
                int remove = Integer.parseInt(scanner.nextLine());
                onhand.remove(remove - 1);

            } else if (option.equals("3")) {
                System.out.println("\nWhich item number would you like to change?\n");
                int list = Integer.parseInt(scanner.nextLine());
                InventoryItem item = onhand.get(list - 1);
                System.out.println("\nAmount to be added:\n");
                int receive = Integer.parseInt(scanner.nextLine());
                item.quantity = item.quantity + receive;

//*negative quantity
            } else if (option.equals("4")) {
                System.out.println("\nWhich item number would you like to remove: \n");
                int list = Integer.parseInt(scanner.nextLine());
                InventoryItem item = onhand.get(list - 1);
                System.out.println("\nAmount to be removed:\n");
                int issue = Integer.parseInt(scanner.nextLine());
                item.quantity = item.quantity - issue;

            }
        }
    }
}