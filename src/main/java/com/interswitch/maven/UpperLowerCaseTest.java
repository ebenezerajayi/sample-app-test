package com.interswitch.maven;

import java.time.LocalDateTime;

public class UpperLowerCaseTest {

    public static void main( String[] args ) {
        UpperLowerCase ulCase = new UpperLowerCase();
        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToUpperCase("Hello World"));

        System.out.printf("%s to %s\n", "Hello World", ulCase.wordToLowerCase("Hello World"));

        System.out.println("New Go-home feature by " + "Backbone Team suggested at " + LocalDateTime.now());
    }
}
