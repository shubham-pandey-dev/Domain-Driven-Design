/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.thoughtworks.domain_driven_design;

import com.thoughtworks.domain_driven_design.cart.Cart;
import com.thoughtworks.domain_driven_design.model.Item;

public class DDD {
    public static void main(String[] args) {
        DDD driver = new DDD();
        driver.drive();
    }
    void drive() {
        System.out.println("Domain Driven Design starts here\n");
        Cart cart = new Cart();
        Item iPadPro = new Item("IPadPro");
        Item heroPen = new Item("Hero Ink Pen");
        Item gmBat = new Item("GM Cricket Bat", 2);
        cart.addItemToCart(iPadPro);
        cart.addItemToCart(heroPen);
        cart.addItemToCart(gmBat);
        System.out.println("Items in cart are: ");
        cart.printItemsInCart();
        System.out.println("\n");
    }
}
