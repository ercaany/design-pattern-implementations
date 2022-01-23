package com.designpatterns.abstractfactory.furniture;

public class TurkishCoffeeTable implements CoffeeTable {
    @Override
    public void drinkOn() {
        System.out.println("drinking on a Turkish Coffee Table..");
    }
}
