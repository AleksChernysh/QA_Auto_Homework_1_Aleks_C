package com.example.employees;

public class Manager extends Employee {

    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Managment of a project");

    }

    @Override
    public void describeRole() {
        System.out.println("Coordination and control");
        System.out.println("Solving problems");
        System.out.println("Communication with stakeholders");
        System.out.println("Motivation of a team");

    }

    public void describeRole(String extraInfo) {
        System.out.println(extraInfo);
    }


}
