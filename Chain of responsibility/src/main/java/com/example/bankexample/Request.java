package com.example.bankexample;

public class Request {

    private final Format format;

    public Request(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }
}
