package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.furniture.*;

public class TurkishFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new TurkishChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new TurkishCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new TurkishSofa();
    }
}
