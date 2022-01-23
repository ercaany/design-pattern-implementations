package com.designpatterns.abstractfactory.factory;

import com.designpatterns.abstractfactory.furniture.Chair;
import com.designpatterns.abstractfactory.furniture.CoffeeTable;
import com.designpatterns.abstractfactory.furniture.Sofa;

public interface FurnitureFactory {
    Chair createChair();

    CoffeeTable createCoffeeTable();

    Sofa createSofa();
}
