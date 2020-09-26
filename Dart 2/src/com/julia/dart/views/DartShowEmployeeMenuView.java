package com.julia.dart.views;

import com.julia.dart.Utilities;

public class DartShowEmployeeMenuView {
    public void render(){
            System.out.println(Utilities.line() + "Employee Database - Type one of the options below:\n" +
                    "1. Search employee\n" +
                    "2. Remove employee\n");
    }

    public void renderExit() { System.out.println("Returning to previous menu."); }

    public void renderError() { System.out.println("Invalid selection, restarting..."); }

    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }

}

