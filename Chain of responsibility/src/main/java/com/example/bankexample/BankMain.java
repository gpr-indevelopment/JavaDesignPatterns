package com.example.bankexample;

public class BankMain {

    public static void main(String[] args) {
        RequestHandler requestHandler = new RequestHandler();
        Account account = new Account("João da Silva");
        account.setBalance(1000.0);
        Request XMLReq = new Request(Format.XML);
        Request CSVReq = new Request(Format.CSV);
        Request PercentReq = new Request(Format.PERCENT);
        requestHandler.respond(XMLReq, account);
        requestHandler.respond(CSVReq, account);
        requestHandler.respond(PercentReq, account);
    }
}
