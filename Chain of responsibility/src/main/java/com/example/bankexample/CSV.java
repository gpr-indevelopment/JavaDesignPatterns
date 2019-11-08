package com.example.bankexample;

public class CSV extends Response {

    public CSV(Response next) {
        super(next);
    }

    @Override
    public void respond(Request request, Account account) {
        if(request.getFormat().equals(Format.CSV)){
            StringBuilder sb = new StringBuilder();
            sb.append(account.getOwner());
            sb.append(",");
            sb.append(account.getBalance());
            System.out.println(sb.toString());
        }
        fireNext(request, account);
    }
}
