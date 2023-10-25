package ru.javabegin.opp.car;

public class BMW extends Car {

    public BMW(String name, String model, String color, int number) {
        super(name, model, color, number); //должен вызвать конструктор у ПЕРВОГО родителя
    }

    public BMW() {
//        System.out.println("bmw");
    }

    @Override
    public void drive() {
        super.signal(); // bmw должен просигналить перед тем как поехать
        super.drive();
        System.out.println("drive bmw");    // Данный метод переопределяет Все родит. Методы drive
    }
}
