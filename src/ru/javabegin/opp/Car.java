package ru.javabegin.opp;


public class  Car extends Transport{

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

    @Override
    void drive() {
        System.out.println("car drive");
    }

    @Override
    void stop() {
        System.out.println("car stop");
    }
}
