package ru.javabegin.opp;

public class Motorbike extends Transport{
    private double volume;
    public Motorbike() {
        this.volume(0.0);
    }

    private void volume(double v) {
    }
    public void voidMethod(){
        System.out.println("Motorbike voidMethod");
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }
}



