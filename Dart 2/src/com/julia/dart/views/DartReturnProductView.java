package com.julia.dart.views;

import com.julia.dart.Utilities;


import java.util.UUID;

public class DartReturnProductView {

    public void render() {
      Integer productID;
      Integer daysRented;

      //customer view for returning a product -Louis
      System.out.println(Utilities.line() + "Please enter the id of the product you wish to return:\n" );
      productID = Utilities.intInput();
      System.out.println(Utilities.line() + "Please enter the number of days the product has been rented:\n" );
      daysRented = Utilities.intInput();

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
