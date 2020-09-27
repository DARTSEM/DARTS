package com.julia.dart.views;

import com.julia.dart.Utilities;
import com.julia.dart.model.DartEmployee;
import com.julia.dart.model.DartProduct;

import java.util.Collection;

public class DartShowGamesView {
    public void render(Collection<DartProduct> productList){
        System.out.println(Utilities.line() + "Product Database - Type one of the options below:\n" +
                "1. Remove product\n" +
                "2. Return to previous menu\n");

        for (DartProduct product : productList) {
            System.out.println(product);
        }
    }

    public void renderExit() { System.out.println("Returning to previous menu."); }

    public void renderError() { System.out.println("Invalid selection, restarting..."); }

    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }
}
