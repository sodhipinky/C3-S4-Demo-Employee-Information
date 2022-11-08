/*
 * Author : Pinky Sodhi
 * Date : 08-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

import java.time.LocalDate;

public class RegionalHead extends Employee {
    String regionName;
    int regionPerformance;
    int reviewRatings;

    public RegionalHead() {
    }

    public RegionalHead(String name,
                        int age,
                        LocalDate dateOfBirth,
                        String address,
                        double salary,
                        String regionName,
                        int regionPerformance,
                        int reviewRatings) {
        super(name, age, dateOfBirth, address, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRatings = reviewRatings;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }

    public int getReviewRatings() {
        return reviewRatings;
    }

    public void setReviewRatings(int reviewRatings) {
        this.reviewRatings = reviewRatings;
    }
}
