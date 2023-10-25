package ru.javabegin.opp;

public class Transport {

    public  Transport() {
//        System.out.println("transport");
    }
    public Transport(String name, String model, String color) {
    this.name = name;
    this.model = model;
    this.color = color;
}
    private String name; // название, которое будет у всех транспортов
    private String model; // модель
    private String color; // цвет
    public static int year; // год выпуска - будет иметь 1 значение на все объекты Transport или дочерний



    public String getName() {return name;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public void setName(String name) {this.name = name;}

    public void drive() {
        System.out.println(" drive transport");
    }
    public void stop() {
            System.out.println("stop transport");
    }
}
