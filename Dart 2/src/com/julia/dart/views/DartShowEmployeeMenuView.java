package com.julia.dart.views;

import com.julia.dart.Utilities;
import com.julia.dart.model.*;

import java.util.Collection;

public class DartShowEmployeeMenuView {
    public void render(Collection<DartEmployee> employeeList){
            System.out.println(Utilities.line() + "Employee Database - Type one of the options below:\n" +
                    "1. Search employee\n" +
                    "2. Remove employee\n" +
                    "3. Return to previous menu\n");
        System.out.println(Utilities.line());

        for (DartEmployee employee : employeeList) {
            System.out.println(employee);
        }

    }
    public void renderExit() { System.out.println("Returning to previous menu."); }

    public void renderError() { System.out.println("Invalid selection, restarting..."); }

    public Integer read() {
        Integer input = Utilities.intInput();

        return input;
    }

}
