package ru.javabegin.opp;

public class BMW extends Car {
    @Override
    public void drive() {
        super.drive();
        System.out.println("drive bmw");    // Данный метод переопределяет Все родит. Методы drive
    }
}
