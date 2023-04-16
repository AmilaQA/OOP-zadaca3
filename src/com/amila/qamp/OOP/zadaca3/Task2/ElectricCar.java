package com.amila.qamp.OOP.zadaca3.Task2;

public class ElectricCar extends Vehicle {
    private ElectricEngine engine;

    public ElectricCar(String model, double capacity) {
        super(model);
        this.engine = new ElectricEngine(capacity);
    }

    @Override
    public void accelerate(double speed) {
        double energyConsumption = 0.4 * speed;
        if (energyConsumption <= this.engine.getCapacity()) {
            this.speed += speed;
            this.engine.decreaseCapacity(energyConsumption);
        }
    }

    @Override
    public void decelerate(double speed) {
        super.decelerate(speed);
        this.engine.brake(speed);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.engine.toString();
    }

}
