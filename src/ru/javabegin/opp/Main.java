package ru.javabegin.opp;

import ru.javabegin.opp.car.Car;

public class Main {
    public static void main(String[] args) {


        Engine engine = new Engine(10);

        Car car = new Car(10, engine);
        car.drive();

//        System.out.println("car.wheelCount = " + car.wheelCount);
//
//        Ural ural = new Ural();
//        System.out.println("ural.wheelCount = " + ural.wheelCount);

//        System.out.println("car.getEngine() = " + car.getEngine());


    }
}
