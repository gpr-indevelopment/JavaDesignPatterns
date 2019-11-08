package com.example.bankexample;

public class XML extends Response {

    public XML(Response next) {
        super(next);
    }

    @Override
    public void respond(Request request, Account account) {
        if(request.getFormat().equals(Format.XML)){
            System.out.println(String.format("<account><owner>%s</owner>", account.getOwner()));
            System.out.println(String.format("<balance>%.2f</balance></account>", account.getBalance()));
        }
        fireNext(request, account);
    }
}
