package com.designpatterns.builder.computer;

public class Computer {
    private Ssd ssd;
    private Ram ram;
    private Processor processor;
    private GraphicsCard graphicsCard;
    private boolean bluetoothEnabled;
    private boolean wifiEnabled;

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ssd = " + ssd.getDescription() +
                ", ram = " + ram.getDescription() +
                ", processor = " + processor.getDescription() +
                ", graphicsCard = " + graphicsCard.getDescription() +
                ", bluetoothEnabled = " + bluetoothEnabled +
                ", wifiEnabled = " + wifiEnabled +
                '}';
    }
}
