package com.designpatterns.factorymethod.logistic;

import com.designpatterns.factorymethod.transport.Ship;
import com.designpatterns.factorymethod.transport.Transport;

public class SeaLogistic implements Logistic {
    public Transport createTransport() {
        return new Ship();
    }
}
