package com.designpatterns.builder.computer;

public class ComputerBuilder {
    private Ssd ssd;
    private Ram ram;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private boolean bluetoothEnabled;
    private boolean wifiEnabled;

    public ComputerBuilder() {
        this.reset();
    }

    public ComputerBuilder addSsd(Ssd ssd) {
        this.ssd = ssd;
        return this;
    }

    public ComputerBuilder addRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder addProcessor(Processor processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder addGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder enableWifi() {
        this.wifiEnabled = true;
        return this;
    }

    public ComputerBuilder enableBluetooth() {
        this.bluetoothEnabled = true;
        return this;
    }

    public Computer build() {
        validate();
        return buildComputer();
    }

    private void validate() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.ssd == null) {
            stringBuilder.append("SSD cannot be null.");
        }
        if (this.ram == null) {
            stringBuilder.append("RAM cannot be null.");
        }
        if (this.processor == null) {
            stringBuilder.append("Processor cannot be null.");
        }
        if (this.graphicsCard == null) {
            stringBuilder.append("GraphicsCard cannot be null.");
        }
        if (!stringBuilder.isEmpty()) {
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void reset() {
        ssd = null;
        ram = null;
        processor = null;
        graphicsCard = null;
        bluetoothEnabled = false;
        wifiEnabled = false;
    }

    private Computer buildComputer() {
        Computer computer = new Computer();
        computer.setSsd(ssd);
        computer.setRam(ram);
        computer.setProcessor(processor);
        computer.setGraphicsCard(graphicsCard);
        computer.setWifiEnabled(wifiEnabled);
        computer.setBluetoothEnabled(bluetoothEnabled);
        return computer;
    }
}
