package com.designpatterns.factorymethod.logistic;

import com.designpatterns.factorymethod.transport.Transport;

public interface Logistic {
    Transport createTransport();
}
