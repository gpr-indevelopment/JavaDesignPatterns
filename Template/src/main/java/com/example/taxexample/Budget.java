package com.example.taxexample;

import java.util.List;

public class Budget {

    private double value;

    private List<Item> items;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
