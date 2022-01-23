package com.designpatterns.abstractfactory.furniture;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("sitting on a Victorian Chair..");
    }
}
