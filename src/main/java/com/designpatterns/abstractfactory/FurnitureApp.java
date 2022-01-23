package com.designpatterns.abstractfactory;

import com.designpatterns.abstractfactory.factory.FurnitureFactory;
import com.designpatterns.abstractfactory.factory.ModernFurnitureFactory;
import com.designpatterns.abstractfactory.factory.TurkishFurnitureFactory;
import com.designpatterns.abstractfactory.factory.VictorianFurnitureFactory;
import com.designpatterns.abstractfactory.furniture.Chair;
import com.designpatterns.abstractfactory.furniture.CoffeeTable;
import com.designpatterns.abstractfactory.furniture.Sofa;

import java.util.Random;

public class FurnitureApp {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = createRandomFactory();
        Chair chair = furnitureFactory.createChair();
        CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();
        Sofa sofa = furnitureFactory.createSofa();

        sofa.layOn();
        chair.sitOn();
        coffeeTable.drinkOn();
    }

    private static FurnitureFactory createRandomFactory() {
        Random random = new Random();
        int randomChoice = random.nextInt(3);
        if (randomChoice == 1) {
            return new VictorianFurnitureFactory();
        } else if (randomChoice == 2) {
            return new ModernFurnitureFactory();
        } else {
            return new TurkishFurnitureFactory();
        }
    }
}
