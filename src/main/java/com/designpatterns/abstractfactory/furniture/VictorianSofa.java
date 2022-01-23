package com.designpatterns.abstractfactory.furniture;

public class VictorianSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("laying on a Victorian Sofa..");
    }
}
