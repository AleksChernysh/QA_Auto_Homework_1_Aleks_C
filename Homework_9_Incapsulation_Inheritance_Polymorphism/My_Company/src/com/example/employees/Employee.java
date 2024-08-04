package com.example.employees;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private static int minSalary = 2000;

    public Employee(String name, int age, int salary) {
        this.name = name;
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Please enter valid age");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > minSalary) {
            this.salary = salary;
        } else {
            System.out.println("The salary isn't correct");
        }
    }


    public void work() {
        System.out.println(" The employee does something  ");
    }

    public void takeBrake() {
        System.out.println("The employee has a brake");

    }

    public void performJob() {

    }

    public void describeRole() {

    }

    public void describeRole(String extraInfo) {

    }

    public void employeeInfo() {
        System.out.println("NAME : " + this.name);
        System.out.println("AGE : " + this.age);
        System.out.println("SALARY : " + this.salary);
    }

}
