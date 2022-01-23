package com.designpatterns.builder.computer;

public enum GraphicsCard {
    GRAPHICS_CARD_1050("GTX 1050 GRAPHICS CARD"),
    GRAPHICS_CARD_1060("GTX 1060 GRAPHICS CARD"),
    GRAPHICS_CARD_1070("GTX 1070 GRAPHICS CARD");

    private final String description;

    GraphicsCard(String graphicsCard) {
        description = graphicsCard;
    }

    public String getDescription() {
        return description;
    }
}
