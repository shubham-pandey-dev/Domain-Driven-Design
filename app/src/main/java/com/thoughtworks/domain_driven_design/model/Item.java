package com.thoughtworks.domain_driven_design.model;

public class Item {
    private final Product product;
    private final int qty;

    public Item(Product product) {
        this.product = product;
        this.qty = 1;
    }

    public Item(Product product, int qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Item { product = " + product.toString() + ", qty = " + qty + " } ";
    }
}
