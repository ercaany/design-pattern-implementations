package com.designpatterns.abstractfactory.furniture;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void drinkOn() {
        System.out.println("drinking on a Modern Coffee Table..");
    }
}
