/*
 * Author : Pinky Sodhi
 * Date : 08-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

import java.time.LocalDate;

public class Employee {
    //properties
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private String address;
    private double salary;
    public Employee() {
    }

    public Employee(String name, int age, LocalDate dateOfBirth, String address, double salary) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working");
    }
}
