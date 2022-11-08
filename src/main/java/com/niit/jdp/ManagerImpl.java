/*
 * Author : Pinky Sodhi
 * Date : 08-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

import java.time.LocalDate;

public class ManagerImpl {
    public static void main(String[] args) {
        Manager manager = new Manager("Pinky",
                25,
                LocalDate.of(1996, 11, 8),
                "Delhi",
                50000,
                10,
                5);
    }
}
