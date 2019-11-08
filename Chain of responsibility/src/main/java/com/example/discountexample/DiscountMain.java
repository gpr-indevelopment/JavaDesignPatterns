package com.example.discountexample;

public class DiscountMain {

    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Budget budget = new Budget(600.0);
        budget.addItem(new Item("Pen", 250.0));
        budget.addItem(new Item("Pencil", 250.0));
        budget.addItem(new Item("Eraser", 250.0));
        budget.addItem(new Item("Sharpener", 250.0));
        budget.addItem(new Item("Ruler", 600.0));
        double finalDiscount = discountCalculator.calculate(budget);
        System.out.println(finalDiscount);
    }
}
