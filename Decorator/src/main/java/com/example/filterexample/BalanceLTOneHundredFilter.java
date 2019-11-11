package com.example.filterexample;

import java.util.function.Predicate;

public class BalanceLTOneHundredFilter extends Filter {

    public BalanceLTOneHundredFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public BalanceLTOneHundredFilter() {
    }

    @Override
    protected Predicate<Account> accountFilterPredicate() {
        return (account -> account.getBalance() < 100);
    }
}
