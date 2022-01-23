package com.designpatterns.builder.computer;

public enum Ssd {
    SSD_500GB("250 GB SSD"), SSD_250GB("500 GB SSD"), SSD_120GB("120 GB SSD");

    private final String description;

    Ssd(String ssdDescription) {
        description = ssdDescription;
    }

    public String getDescription() {
        return description;
    }
}
