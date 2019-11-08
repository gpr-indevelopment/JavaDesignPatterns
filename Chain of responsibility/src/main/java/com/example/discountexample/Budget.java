package com.example.discountexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    private final double value;

    private final List<Item> items;

    public Budget(double value) {
        this.value = value;
        items = new ArrayList<>();
    }

    public double getValue() {
        return value;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public boolean hasItemName(String name){
        for (Item item : items) {
            if(item.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
