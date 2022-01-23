package com.designpatterns.abstractfactory.furniture;

public class ModernSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("laying on a Modern Sofa..");
    }
}
