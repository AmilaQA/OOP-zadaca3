package com.amila.qamp.OOP.zadaca3.Task2;

public class Vehicle {

    public double speed;
    private String model;

    public Vehicle(String model) {
        this.speed = 0.0;
        this.model = model;
    }

    public void setSpeed(double speed) { // setter
        this.speed = 0.0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setModel(String model) { // setter
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void accelerate(double acceleration) {
        this.speed += acceleration;
    }

    public void decelerate(double deceleration) {
        if (this.speed - deceleration < 0) {
            this.speed = 0.0;
        } else {
            this.speed -= deceleration;
        }

    }

    @Override
    public String toString() {
        return "vehicle: " + "{" + this.model + "}, " + "speed: " + "{" + this.speed + "}";
    }

}
