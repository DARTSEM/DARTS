package com.julia.dart.views;

import com.julia.dart.Utilities;

public class DartCustomerView {
    public void render() {
        System.out.println(Utilities.line() + "Customer Screen - Type one of the options below:\n" +
                "1. Rent a game\n" +
                "2. Return a game\n" +
                "3. Return to Main Menu\n");
    }

    public void renderExit() {
        System.out.println("Returning to main menu.");
    }

    public void renderError() {
        System.out.println("Invalid selection, restarting...");
    }

    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }
}
