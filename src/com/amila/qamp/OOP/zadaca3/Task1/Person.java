package com.amila.qamp.OOP.zadaca3.Task1;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
