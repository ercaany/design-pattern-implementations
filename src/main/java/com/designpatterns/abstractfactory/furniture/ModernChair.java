package com.designpatterns.abstractfactory.furniture;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("sitting on a Modern Chair..");
    }
}
