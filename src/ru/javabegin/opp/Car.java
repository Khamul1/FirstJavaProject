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
    public void drive() {

        super.drive();
        super.stop();

        System.out.println("drive car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }
}
