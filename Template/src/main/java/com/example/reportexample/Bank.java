package com.example.reportexample;

public class Bank {

    private final String name;

    private final String address;

    private String email;

    private int telephoneNumer;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephoneNumer() {
        return telephoneNumer;
    }

    public void setTelephoneNumer(int telephoneNumer) {
        this.telephoneNumer = telephoneNumer;
    }
}
