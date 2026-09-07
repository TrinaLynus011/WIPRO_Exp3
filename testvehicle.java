package com.automobiles.vehicle;

import com.automobiles.twowheeler.Hero;
import com.automobiles.twowheeler.Honda;

public class TestVehicle {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println(
            "----- HERO -------------------------------------------"
        );

        System.out.println(
            "Model Name: "
            + hero.getModelName()
        );

        System.out.println(
            "Registration Number: "
            + hero.getRegistrationNumber()
        );

        System.out.println(
            "Owner Name: "
            + hero.getOwnerName()
        );

        System.out.println(
            "Speed: "
            + hero.getSpeed()
        );

        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println(
            "----- HONDA ------------------------------------------"
        );

        System.out.println(
            "Model Name: "
            + honda.getModelName()
        );

        System.out.println(
            "Registration Number: "
            + honda.getRegistrationNumber()
        );

        System.out.println(
            "Owner Name: "
            + honda.getOwnerName()
        );

        System.out.println(
            "Speed: "
            + honda.getSpeed()
        );

        honda.cdplayer();
    }
}
