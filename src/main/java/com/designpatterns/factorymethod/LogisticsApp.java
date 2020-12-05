package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.factory.LogisticFactory;
import com.designpatterns.factorymethod.logistic.Logistic;
import com.designpatterns.factorymethod.logistic.LogisticType;

public class LogisticsApp {
    public static void main(String[] args) {
        LogisticFactory factory = new LogisticFactory();
        Logistic airLogistic = factory.createLogistic(LogisticType.AIR);
        airLogistic.createTransport().deliver();

        Logistic roadLogistic = factory.createLogistic(LogisticType.ROAD);
        roadLogistic.createTransport().deliver();

        Logistic seaLogistic = factory.createLogistic(LogisticType.SEA);
        seaLogistic.createTransport().deliver();
    }
}
