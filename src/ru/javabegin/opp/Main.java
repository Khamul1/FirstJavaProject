package ru.javabegin.opp;

import ru.javabegin.opp.motorbike.Kawasaki;
import ru.javabegin.opp.motorbike.Ural;

public class Main {
    public static void main(String[] args) {

        Kawasaki kawasaki = new Kawasaki("Jj","super model","orange",1999);
        kawasaki.jump();

        Ural ural = new Ural("JJ","super model","orange",2.5,true);
        ural.showInfo();



    }
}
