package com.example.stateexample;

public class StateTest {

	public static void main(String[] args) {
		Budget budget = new Budget(1000);
		budget.approve();
		budget.applyDiscount();
		budget.applyDiscount();
		budget.applyDiscount();
		System.out.println(budget.getValue());
	}
}
