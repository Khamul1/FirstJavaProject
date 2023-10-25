package ru.javabegin.opp;

import ru.javabegin.opp.car.BMW;
import ru.javabegin.opp.car.Toyota;

public class Main {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.year = 2000; // это значение будет одно и тоже для всех объектов Transport или дочерних
        System.out.println("toyota.year = " + toyota.year);

        BMW bmw = new BMW();
        System.out.println("bmw.year = " + bmw.year);
    }
}
