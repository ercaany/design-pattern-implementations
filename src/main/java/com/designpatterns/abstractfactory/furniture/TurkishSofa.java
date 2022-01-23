package com.designpatterns.abstractfactory.furniture;

public class TurkishSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("laying on a Turkish Sofa..");
    }
}