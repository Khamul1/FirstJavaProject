package ru.javabegin.opp;

public class Car {
    public Car() {
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    private String name;
    private String model;
    private String color;


    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    void drive(){ // данный метод ничего не возращает
//        System.out.println(name + " drive"); // конкатенация строк (соединение строк)
    }

    void stop(){ //данный метод ничего не возращает
//        System.out.println("stop");
    }

    public int sumNumbers(int d1, int d2){

        if (d1>0){
            return d1-d2;
        }else{
            return d1 + d2;
    }

    }
}
