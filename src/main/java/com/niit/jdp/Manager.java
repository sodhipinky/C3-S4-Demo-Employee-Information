/*
 * Author : Pinky Sodhi
 * Date : 08-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class Manager extends Employee {
    private int teamSize;
    private int teamRatings;

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
}
