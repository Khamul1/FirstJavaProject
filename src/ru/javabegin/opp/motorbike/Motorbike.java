package ru.javabegin.opp.motorbike;

import ru.javabegin.opp.Transport;

public class Motorbike extends Transport {

    public Motorbike() {
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        this.volume = volume;
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }

    private double volume; // объем бака

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

