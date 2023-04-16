package com.amila.qamp.OOP.zadaca3.Task2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", 70);
        System.out.println(car.toString());
        car.accelerate(60);
        System.out.println(car.toString());
        car.decelerate(20);
        System.out.println(car.toString());

        ElectricCar electricCar = new ElectricCar("Toyota", 50);
        System.out.println(electricCar.toString());
        electricCar.toString();
        System.out.println(electricCar.toString());
        electricCar.accelerate(80);
        System.out.println(electricCar.toString());
        electricCar.decelerate(30);
        System.out.println(electricCar.toString());


    }
}