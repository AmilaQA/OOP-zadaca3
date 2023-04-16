package com.amila.qamp.OOP.zadaca3.Task1;

public class Employee extends Person {

    private double annualSalary;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public String toString() {
        return super.toString();
    }
}
