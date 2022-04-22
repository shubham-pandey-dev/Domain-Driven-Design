package com.thoughtworks.domain_driven_design.model;

import java.util.Currency;

public class Price {
    private final int amount;
    private final Currency currency;

    public Price(int price, Currency currency) {
        this.amount = price;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Price { amount = " + amount + ", currency = " + currency + " } ";
    }
}
