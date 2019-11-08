package com.example.discountexample;

public class DiscountByCoupledSale implements Discount{

    private Discount next;

    @Override
    public double discount(Budget budget) {
        if(budget.hasItemName("PEN") && budget.hasItemName("PENCIL")){
            return budget.getValue()*0.05;
        }
        return 0;
    }

    @Override
    public void setNext(Discount discount) {
        this.next = discount;
    }

}
