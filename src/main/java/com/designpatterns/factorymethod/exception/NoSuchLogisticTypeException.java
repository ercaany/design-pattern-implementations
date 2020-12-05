package com.designpatterns.factorymethod.exception;

public class NoSuchLogisticTypeException extends RuntimeException {
    public NoSuchLogisticTypeException(String message) {
        super(message);
    }
}
