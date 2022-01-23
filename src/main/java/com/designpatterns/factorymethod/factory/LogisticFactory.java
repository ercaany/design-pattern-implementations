package com.designpatterns.factorymethod.factory;

import com.designpatterns.factorymethod.exception.NoSuchLogisticTypeException;
import com.designpatterns.factorymethod.logistic.*;

public class LogisticFactory {

    public Logistic createLogistic(LogisticType logisticType) {
        validateLogisticType(logisticType);

        if (logisticType.equals(LogisticType.AIR)) {
            return new AirLogistic();
        } else if (logisticType.equals(LogisticType.ROAD)) {
            return new RoadLogistic();
        } else if (logisticType.equals(LogisticType.SEA)) {
            return new SeaLogistic();
        }

        return null;
    }

    private void validateLogisticType(LogisticType logisticType) {
        if (logisticType == null) {
            throw new NoSuchLogisticTypeException("logistic type cannot be null");
        }
    }

}
