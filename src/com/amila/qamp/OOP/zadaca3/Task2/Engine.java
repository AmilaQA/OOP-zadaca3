package com.amila.qamp.OOP.zadaca3.Task2;

public class Engine {
    private double capacity;

    public Engine(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) { // setter
        this.capacity = capacity;
    }

    public void increaseCapacity(double newCapacity) {
        this.capacity += newCapacity;
    }

    public void decreaseCapacity(double newCapacity) {
        this.capacity -= newCapacity;
    }

    @Override
    public String toString() {
        return "Capacity: " +  this.capacity;
    }
}

