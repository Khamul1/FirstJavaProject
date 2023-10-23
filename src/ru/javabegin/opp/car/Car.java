package ru.javabegin.opp.car;


import ru.javabegin.opp.Transport;

public class  Car extends Transport {

    public Car() {
        System.out.println("car");
        // Перекидываем все значение в род. Конструктор
    }

    public Car(String name, String model, String color) {
        super("name", "model", "color"); // вызов конструктора родительского класса с пустыми значениями аргументов
        System.out.println("transport");
        // Перекидываем все значение в род. Конструктор
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number) {
        this.number = number;
    }
    private  int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public  void  signal(){
        System.out.println("signal");
    }

//    @Override
//    public void drive() {
//        super.drive();
//            //доработанный функционал для метода drive
//        System.out.println("drive car");
//    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("stop car");
    }

}
