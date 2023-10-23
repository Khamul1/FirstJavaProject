package ru.javabegin.opp.motorbike;

public class Kawasaki extends Motorbike {

    public Kawasaki(int year) {
        this.year = year;
    }

    public Kawasaki(String name, String model, String color, int year) {
        super(name, model, color);
        this.year = year;
    }

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void jump(){
        System.out.println("Kawasaki jump");
    }

}
