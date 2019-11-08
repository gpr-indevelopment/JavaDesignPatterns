package com.example.discountexample;

public class DiscountCalculator {

    public double calculate(Budget budget){
        Discount d1 = new DiscountByFiveItems();
        Discount d2 = new DiscountByMoreThanFiveHundred();
        Discount d3 = new NoDiscount();
        d1.setNext(d2);
        d2.setNext(d3);
        return d1.discount(budget);
    }
}
