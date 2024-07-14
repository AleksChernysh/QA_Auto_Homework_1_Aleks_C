package com.example.employees;

public class Employee {

    private String name;
    private int age;
    private int salary;

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
        if (salary > 2000) {
            this.salary = salary;
        } else {
            System.out.println("The salary isn't correct");
        }
    }


    public void work() {
        System.out.println(name + " is working from ");
    }

    public void takeBrake() {

    }

    public void performJob() {

    }

    public void describeRole() {

    }

    public void describeRole(String extraInfo) {

    }

}
