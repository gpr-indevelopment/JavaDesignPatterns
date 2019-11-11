package com.example.filterexample;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Filter {

    private final Filter nextFilter;

    public Filter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public Filter() {
        this.nextFilter = null;
    }

    public Set<Account> filter(List<Account> accounts){
        Set<Account> filteredAccounts = accounts.stream().filter(accountFilterPredicate()).collect(Collectors.toSet());
        filteredAccounts.addAll(applyNextFilter(accounts));
        return filteredAccounts;
    }

    protected abstract Predicate<Account> accountFilterPredicate();

    private Set<Account> applyNextFilter(List<Account> accounts){
        if(Objects.nonNull(nextFilter)){
            return nextFilter.filter(accounts);
        }
        return new HashSet<>();
    }
}
