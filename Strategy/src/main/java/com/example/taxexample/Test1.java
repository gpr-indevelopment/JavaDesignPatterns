package com.example.taxexample;

public class Test1 {

	public static void main(String[] args) {
		Budget scenario1 = new Budget(100.0);
		Budget scenario2 = new Budget(1500.0);
		Budget scenario3 = new Budget(4000.0);

		TaxCalculator taxCalculator = new TaxCalculator();
		ICCC iccc = new ICCC();
		taxCalculator.calculate(scenario1, iccc);
		taxCalculator.calculate(scenario2, iccc);
		taxCalculator.calculate(scenario3, iccc);
	}
}
