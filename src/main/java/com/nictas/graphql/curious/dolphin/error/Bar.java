package com.nictas.graphql.curious.dolphin.error;

public class Bar extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public Bar(String message, Throwable cause) {
        super(message, cause);
    }

    public Bar(String message) {
        super(message);
    }

}
