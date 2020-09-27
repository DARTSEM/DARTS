package com.julia.dart.views;

import com.julia.dart.Utilities;


import java.util.UUID;

public class DartReturnProductView {

    public void render(Collection<DartProduct> productList) {
        //customer view for returning a product -Louis
        System.out.println(Utilities.line() + "Customer Screen - Type one of the options below:\n" +
                "1. Return a product\n" +
                "2. Return to previous menu\n");
      for (DartProduct product : productList) {
          System.out.println(product);
      }
    }

    public void renderSuccess() { System.out.println("Successfully returned a product!"); }

    }

    public void renderExit() {
        System.out.println("Returning to main menu.");
    }

    public void renderError() {
        System.out.println("Invalid input, restarting...");
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
