package com.designpatterns.abstractfactory.furniture;

public class TurkishChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("sitting on a Turkish Chair..");
    }
}
