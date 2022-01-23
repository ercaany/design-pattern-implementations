package com.designpatterns.builder;

import com.designpatterns.builder.computer.*;

/*
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and
 * representations of an object using the same construction code
 */
public class BuilderApp {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .addGraphicsCard(GraphicsCard.GRAPHICS_CARD_1060)
                .addProcessor(Processor.PROCESSOR_I7)
                .addSsd(Ssd.SSD_250GB)
                .addRam(Ram.RAM_8GB)
                .enableWifi()
                .enableBluetooth()
                .build();

        System.out.println(computer);

        Computer computer2 = new ComputerBuilder()
                .addGraphicsCard(GraphicsCard.GRAPHICS_CARD_1070)
                .addProcessor(Processor.PROCESSOR_I5)
                .addSsd(Ssd.SSD_250GB)
                .addRam(Ram.RAM_4GB)
                .enableBluetooth()
                .build();

        System.out.println(computer2);

        Computer computer3 = new ComputerBuilder()
                .addGraphicsCard(GraphicsCard.GRAPHICS_CARD_1050)
                .addProcessor(Processor.PROCESSOR_I9)
                .addSsd(Ssd.SSD_500GB)
                .addRam(Ram.RAM_16GB)
                .enableWifi()
                .build();

        System.out.println(computer3);

        Computer computer4= new ComputerBuilder()
                .enableWifi()
                .build();

        System.out.println(computer4);
    }
}
