/*
 * Author : Pinky Sodhi
 * Date : 08-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;
    private int teamRatings;

    public Manager() {
    }

    public Manager(String name, int age, LocalDate dateOfBirth, String address, double salary, int teamSize, int teamRatings) {
        super(name, age, dateOfBirth, address, salary); //super() is used to call the constructor of the parent class
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRatings() {
        return teamRatings;
    }

    public void setTeamRatings(int teamRatings) {
        this.teamRatings = teamRatings;
    }

    public void managing() {
        System.out.println("I am managing my team");
        super.work(); //super keyword is used to call the method of the parent class
    }

    public double calculateYearlyIncrement() {
        if (teamRatings > 8) {
            return 0.125;
        } else {
            return 0;
        }
    }
}
