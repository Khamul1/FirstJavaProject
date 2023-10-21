package ru.javabegin.opp;


public class  Car extends Transport{

    public Car(String name, String model, String color) {
        super(name, model, color); // перекидываем все значение в род.конструктор
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
}
