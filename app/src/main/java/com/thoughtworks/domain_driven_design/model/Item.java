package com.thoughtworks.domain_driven_design.model;

public class Item {
    private final String name;
    private final int qty;

    public Item(String name) {
        this.name = name;
        this.qty = 1;
    }

    public Item(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item { name = " + name + ", qty = " + qty + " } ";
    }
}
