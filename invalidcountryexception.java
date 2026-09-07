package com.exceptionhandling;

public class InvalidCountryException
    extends Exception {

    public InvalidCountryException() {

        super();
    }

    public InvalidCountryException(
        String message
    ) {

        super(message);
    }
}
