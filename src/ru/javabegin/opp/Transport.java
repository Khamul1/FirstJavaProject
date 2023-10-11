package ru.javabegin.opp;

public class Transport {

    private String name;
    private String model;
    private String color;


    public String getName() {return name;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public void setName(String name) {this.name = name;}

    void drive() {
        System.out.println(name + " drive");
    }
    void stop() {
            System.out.println(name + "stop");
    }
}
