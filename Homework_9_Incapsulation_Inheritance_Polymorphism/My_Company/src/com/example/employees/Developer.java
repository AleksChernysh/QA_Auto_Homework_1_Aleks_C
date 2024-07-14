package com.example.employees;

public class Developer extends Employee {

    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println("Developing of a project");
    }

    @Override
    public void describeRole() {
        System.out.println("Сreating software");

    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("building software");
        System.out.println("Developing apps and websites");
        System.out.println("Bringing ideas to life with code");

    }
}
