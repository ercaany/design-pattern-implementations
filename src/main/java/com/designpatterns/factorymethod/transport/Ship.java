package com.designpatterns.factorymethod.transport;

public class Ship implements Transport {
    public void deliver() {
        System.out.println("delivering by ship");
    }
}
