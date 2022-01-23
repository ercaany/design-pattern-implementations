package com.designpatterns.abstractfactory.furniture;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void drinkOn() {
        System.out.println("drinking on a Victorian Coffee Table..");
    }
}
