package com.designpatterns.builder.computer;

public enum Ram {
    RAM_4GB("4 GB RAM"), RAM_8GB("8 GB RAM"), RAM_16GB("16 GB RAM");

    private final String description;

    Ram(String ramDescription) {
        description = ramDescription;
    }

    public String getDescription() {
        return description;
    }
}
