package com.example.bankexample;

public class RequestHandler {

    public void respond(Request request, Account account){
        Response r3 = new XML(null);
        Response r2 = new Percent(r3);
        Response r1 = new CSV(r2);
        r1.respond(request, account);
    }
}
