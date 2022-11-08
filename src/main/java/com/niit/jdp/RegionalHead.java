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
}
