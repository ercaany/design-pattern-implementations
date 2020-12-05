package com.designpatterns.factorymethod.transport;

public class Plane implements Transport {
    public void deliver() {
        System.out.println("delivering by plane");
    }
}
