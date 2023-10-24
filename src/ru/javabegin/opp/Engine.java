package ru.javabegin.opp;

public class Engine {
    public Engine() {
    }

    public Engine(double volume) {
        this.volume = volume;
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
