package com.automobiles.twowheeler;

import com.automobiles.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {

        return "Honda Activa";
    }

    @Override
    public String getRegistrationNumber() {

        return "TN02CD5678";
    }

    @Override
    public String getOwnerName() {

        return "Rahul";
    }

    public int getSpeed() {

        return 90;
    }

    public void cdplayer() {

        System.out.println(
            "Honda: CD player is being controlled."
        );
    }
}
