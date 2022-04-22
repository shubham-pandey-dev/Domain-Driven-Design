package com.thoughtworks.domain_driven_design.cart;

import com.thoughtworks.domain_driven_design.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    final private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItemToCart(Item item) {
        items.add(item);
    }

    public void printItemsInCart() {
        items.forEach(item -> System.out.println(item.toString()));
    }
}
