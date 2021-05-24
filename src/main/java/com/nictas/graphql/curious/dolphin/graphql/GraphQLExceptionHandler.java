package com.nictas.graphql.curious.dolphin.graphql;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nictas.graphql.curious.dolphin.error.Foo;

import graphql.kickstart.spring.error.ThrowableGraphQLError;

@Component
public class GraphQLExceptionHandler {

    @ExceptionHandler(Foo.class)
    public ThrowableGraphQLError handle(Foo e) {
        return new ThrowableGraphQLError(e);
    }

    @ExceptionHandler(Throwable.class)
    public ThrowableGraphQLError handle(Throwable e) {
        return new ThrowableGraphQLError(e, "Internal Server Error(s) while executing query");
    }

}
