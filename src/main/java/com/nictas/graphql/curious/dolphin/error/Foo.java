package com.nictas.graphql.curious.dolphin.error;

public class Foo extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public Foo(String message, Throwable cause) {
        super(message, cause);
    }

    public Foo(String message) {
        super(message);
    }

}
