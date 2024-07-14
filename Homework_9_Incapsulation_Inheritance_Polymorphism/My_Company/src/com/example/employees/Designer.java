package com.example.employees;

public class Designer extends Employee{
    public Designer(String name,int age,int salary) {
        super(name,age,salary);
    }
    @Override
    public void performJob() {
        System.out.println("Design of a project");

    }
    @Override
    public void describeRole() {
        System.out.println("Creation of convenient, aesthetic and functional products");

    }
    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Creation of layouts and interfaces");
        System.out.println("Responsible for the logic of interaction with the site or application");
        System.out.println("Collaborates with developers to turn mock-ups into a real product");

    }
}
