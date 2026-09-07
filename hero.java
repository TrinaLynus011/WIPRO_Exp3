package com.automobiles.twowheeler;

import com.automobiles.Vehicle;

public class Hero extends Vehicle {

    @Override
    public String getModelName() {

        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {

        return "TN01AB1234";
    }

    @Override
    public String getOwnerName() {

        return "Akshitha";
    }

    public int getSpeed() {

        return 80;
    }

    public void radio() {

        System.out.println(
            "Hero: Radio device is being controlled."
        );
    }
}
