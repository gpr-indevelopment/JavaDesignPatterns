package com.example.bankexample;

public class Percent extends Response{

    public Percent(Response next) {
        super(next);
    }

    @Override
    public void respond(Request request, Account account) {
        if(request.getFormat().equals(Format.PERCENT)){
            StringBuilder sb = new StringBuilder();
            sb.append(account.getOwner());
            sb.append("%");
            sb.append(account.getBalance());
            System.out.println(sb.toString());
        }
        fireNext(request, account);
    }
}
