/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */

package com.nictas.graphql.curious.dolphin.solace;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageBindings {

    String INPUT = "input";

    @Input(INPUT)
    SubscribableChannel input();

}
