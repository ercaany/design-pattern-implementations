package com.designpatterns.builder.computer;

public enum Processor {
    PROCESSOR_I5("i5 processor"), PROCESSOR_I7("i7 processor"), PROCESSOR_I9("i9 processor");

    private final String description;

    Processor(String processorDescription) {
        description = processorDescription;
    }

    public String getDescription() {
        return description;
    }
}
