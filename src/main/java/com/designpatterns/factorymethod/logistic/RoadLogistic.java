package com.designpatterns.factorymethod.logistic;

import com.designpatterns.factorymethod.transport.Transport;
import com.designpatterns.factorymethod.transport.Truck;

public class RoadLogistic implements Logistic {
    public Transport createTransport() {
        return new Truck();
    }
}
