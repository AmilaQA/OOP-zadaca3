package com.amila.qamp.OOP.zadaca3.Task1;

public class MainPerson {
    public static void main(String[] args) {
        Employee employee = new Employee("Amila", 1000, "123456");
        System.out.println("Name: " + "{" + employee.getName() + "}, " + "salary: " + "{" + employee.getAnnualSalary() + "}, " + "insurance number " + "{" + employee.getNationalInsuranceNumber() + "}");


    }
}