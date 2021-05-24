package com.nictas.graphql.curious.dolphin.graphql;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nictas.graphql.curious.dolphin.error.Bar;
import com.nictas.graphql.curious.dolphin.error.Foo;
import com.nictas.graphql.curious.dolphin.model.Droid;
import com.nictas.graphql.curious.dolphin.model.Human;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public List<Human> getAllHumans() {
        throw new Foo("Should not be masked");
    }

    public List<Droid> getAllDroids() {
        throw new Bar("Should be masked");
    }

}
