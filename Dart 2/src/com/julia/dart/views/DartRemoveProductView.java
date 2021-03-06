package com.julia.dart.views;

import com.julia.dart.Utilities;
import com.julia.dart.model.DartModel;

import java.util.UUID;

public class DartRemoveProductView {
    public void render() {

        System.out.println(Utilities.line() + "Which product should be removed?\n" +
                "ID:");
    }

    public void renderSuccess() { System.out.println("Successfully removed a product!"); }

    public void renderError() { System.out.println("Invalid entry, please try again."); }

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
