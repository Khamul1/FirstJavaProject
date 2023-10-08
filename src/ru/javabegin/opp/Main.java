package ru.javabegin.opp;

public class Main {
    public static void main(String[] args) {
        // объекты, которые можем создать на основе 1 класса
        // переменные ссылаются на объекты

        Car nissan = new Car("nissan","sedan","blue"); // через ссылки обращаемся к объекту и можем изменять его свойства
        nissan.setColor("blue");
        nissan.setName("nissan");
        nissan.setModel("sedan");


        nissan.drive();
        int result = nissan.sumNumbers(4555,5555);

        System.out.println("result= "+ result);
//
//        System.out.println(nissan.getName()); // sout + Tab



    }
}
