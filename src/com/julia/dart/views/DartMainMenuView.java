package com.julia.dart.views;


import com.julia.dart.Utilities;

import java.io.Console;

public class DartMainMenuView {

    public void render() {
        System.out.println(Utilities.line() + "Main Menu:\n" +
                "Welcome to DART, your good old game rental system. The competition has no steam to keep up!\n" +
                "\n" +
                "Please specify your role by entering one of the options given:\n" +
                "1. Enter “M” for Manager \n" + //Password = "admin1234"
                "2. Enter “E” for Employee \n" + //Password = "password123"
                "3. Enter “C” for Customer\n" +
                "4. Enter “X” to exit system \n");
    }

    public void renderExit() {
        System.out.println("Exiting the system. Bye Felicia!");
    }


    public void renderError() {
        System.out.println("Invalid selection, restarting...");
    }

    public String read() {
        String mainMenuSelect = Utilities.stringInput();

        return mainMenuSelect;

    }
}
