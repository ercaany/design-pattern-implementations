package com.designpatterns.factorymethod.transport;

public class Truck implements Transport {
    public void deliver() {
        System.out.println("delivering by truck");
    }
}
