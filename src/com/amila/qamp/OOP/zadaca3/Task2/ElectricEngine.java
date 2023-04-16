package com.amila.qamp.OOP.zadaca3.Task2;

public class ElectricEngine extends Engine {

    public ElectricEngine(double capacity) {
        super(capacity);
    }

    public void brake(double speed) {
        this.increaseCapacity(0.1 * speed);
    }
}
