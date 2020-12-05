package com.designpatterns.factorymethod.logistic;

import com.designpatterns.factorymethod.transport.Plane;
import com.designpatterns.factorymethod.transport.Transport;

public class AirLogistic implements Logistic {
    public Transport createTransport() {
        return new Plane();
    }
}
