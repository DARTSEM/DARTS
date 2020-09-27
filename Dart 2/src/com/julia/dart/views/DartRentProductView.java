package com.julia.dart.views;
import com.julia.dart.Utilities;

import java.util.UUID;

public class DartRentProductView {
  
    public void render() {
        //Costumer view for renting a product -Louis
        System.out.println(Utilities.line() + "Customer Screen - Type one of the options below:\n" +
                "1. Enter id of product you wish to rent:\n" +
                "2. Return to Main Menu\n");
    }

    public void renderExit() {
        System.out.println("Returning to main menu.");
    }

    public void renderError() {
        System.out.println("Invalid id, restarting...");
    }

    public UUID read() {
        String input = Utilities.stringInput();
        UUID retVal = null; //initialize as null otherwise compiler doesn't know what to do with it/ have to give it

        //initial value
        try {
            retVal = UUID.fromString(input); //converts UUID from a string
            return retVal;
        } catch (IllegalArgumentException e) {
            return retVal;
        }
    }
  
}
