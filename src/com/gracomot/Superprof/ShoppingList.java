package com.gracomot.Superprof;

import java.text.NumberFormat;

public class ShoppingList {
    private String date;
    private String store;
    private double amountSpent;

    public ShoppingList(String date, String store, double amountSpent) {
        this.date = date;
        this.store = store;
        this.amountSpent = amountSpent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getAmountSpent() {
        return NumberFormat.getCurrencyInstance().format(amountSpent);
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }
}
