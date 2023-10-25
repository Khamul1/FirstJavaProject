package ru.javabegin.opp.motorbike;

public class Kawasaki extends Motorbike {

    public Kawasaki() {
    }

    public Kawasaki(String name, String model, String color) {
        super(name, model, color);
    }

    public void jump(){
        System.out.println("Kawasaki jump");
    }

}
