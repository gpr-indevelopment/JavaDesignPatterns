package com.example.bankexample;

import java.util.Objects;

public abstract class Response {

    protected Response next;

    public Response(Response next) {
        this.next = next;
    }

    public abstract void respond(Request request, Account account);

    protected void fireNext(Request request, Account account){
        if(Objects.nonNull(next)){
            next.respond(request, account);
        }
    }
}
