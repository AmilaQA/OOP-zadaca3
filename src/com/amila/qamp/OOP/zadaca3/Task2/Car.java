package com.amila.qamp.OOP.zadaca3.Task2;

public class Car extends Vehicle {

    private Engine engine;

    public Car(String model, double capacity) {
        super(model);
        this.engine = new DieselEngine(capacity);
    }

    @Override
    public void accelerate(double speed) {
        double fuelConsumption = 0.2 * speed;
        if (fuelConsumption <= this.engine.getCapacity()) {
            this.speed += speed;
            this.engine.decreaseCapacity(fuelConsumption);
        }
    }

    @Override
    public void decelerate(double speed) {
        super.decelerate(speed);
        this.engine.increaseCapacity(0.1 * speed);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.engine.toString();
    }

}
