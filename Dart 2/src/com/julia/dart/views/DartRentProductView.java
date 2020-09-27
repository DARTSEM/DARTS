package com.julia.dart.views;
import com.julia.dart.Utilities;

import java.util.UUID;

public class DartRentProductView {
  
    public void render(Collection<DartProduct> productList) {
        //customer view for renting a product -Louis
        System.out.println(Utilities.line() + "Which product would you like to rent?\n" +
                "ID:");
        for (DartProduct product : productList) {
            System.out.println(product);
        }
    }

    public void renderSuccess() { System.out.println("Successfully rented a product!"); }

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
