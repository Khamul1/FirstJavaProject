package ru.javabegin.opp.motorbike;

public class Ural extends Motorbike {

    public Ural() {
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        this.firstAidKit = firstAidKit;
    }

    private boolean firstAidKit; // есть ли аптечка

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public void showInfo(){
        System.out.println("name=" + getName());
        System.out.println("volume="+getVolume());
        System.out.println("aid="+isFirstAidKit());
    }
}



