package com.julia.dart.views;

import com.julia.dart.Utilities;

public class DartCustomerView {
    public void render() {
        //Customer menu options
        System.out.println(Utilities.line() + "Customer Screen - Type one of the options below:\n" +
                "1. Rent a game\n" +
                "2. Return a game\n" +
                "3. Return to Main Menu\n");
    }
    //Exit message printed when exiting Customer menu
    public void renderExit() {
        System.out.println("Returning to main menu.");
    }
    //Error message printed when error occurs
    public void renderError() {
        System.out.println("Invalid selection, restarting...");
    }
    //Input to select which menu to choose
    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }
}
