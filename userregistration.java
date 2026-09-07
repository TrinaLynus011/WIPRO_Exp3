package com.exceptionhandling;

public class UserRegistration {

    public static void registerUser(
        String username,
        String userCountry
    ) throws InvalidCountryException {

        if (!userCountry.equals("India")) {

            throw new InvalidCountryException(
                "User Outside India cannot be registered"
            );

        } else {

            System.out.println(
                "User registration done successfully"
            );
        }
    }

    public static void main(String[] args) {

        try {

            registerUser(
                "Mickey",
                "US"
            );

        } catch (InvalidCountryException e) {

            System.out.println(
                e.getMessage()
            );
        }
    }
}
