package ru.javabegin.opp;

public class Ural extends Motorbike{
    private boolean firstAidKit;

    public Ural(){
        super();
        this.firstAidKit = false;
    }

    public Ural(double volume, boolean firstAidKit) {
        super(volume);
        this.firstAidKit = firstAidKit;
    }
}
