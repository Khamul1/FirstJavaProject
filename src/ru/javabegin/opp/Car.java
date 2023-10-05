package ru.javabegin.opp;

public class Car {

    String name;
    String model;
    String color;

    void drive(){ // данный метод ничего не возращает
        System.out.println(name + " drive"); // конкатенация строк (соединение строк)
    }

    void stop(){ //данный метод ничего не возращает
        System.out.println("stop");
    }
}
