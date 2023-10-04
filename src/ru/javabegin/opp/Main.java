package ru.javabegin.opp;

public class Main {
    public static void main(String[] args) {
        // объекты, которые можем создать на основе 1 класса
        // переменные ссылаются на объекты

        Car nissan = new Car(); // через ссылки обращаемся к объекту и можем изменять его свойства
        nissan.color = "blue";
        nissan.name = "nissan almera";
        nissan.model = "sedan";

        Car bmw = new Car();
        bmw.color = "black";
        bmw.name = "bmw x5";
        bmw.model = "crossover";

        new Car(); // Объект без ссылки( не сможем к нему обратиться)

        System.out.println(nissan.color); // sout + Tab
        System.out.println(bmw.color);



    }
}
