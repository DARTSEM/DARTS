/* package com.julia.dart.views;
import com.julia.dart.Utilities;
import com.julia.dart.model.DartEmployee;

import java.util.UUID;

public class DartSearchEmployeeView {
    public void render() {
        System.out.println(Utilities.line() + "Employee Database\n " +
                "Please enter employee ID:\n");
    }

    public void renderSuccess(DartEmployee employee) {
        String output = employee.getId().toString() + " : ";
        output += employee.getName() + " - ";
        output += employee.getBirthYear().toString() + " ( " ;
        output += employee.getAge().toString() + " ): ";
        output += employee.getMonthlySalary().toString() + " SEK.";

        System.out.println(Utilities.line() + output);
    }
    public void renderError() { System.out.println("Invalid entry, please try again.");}

    public UUID read() {
        UUID retVal = null; //initialize as null otherwise compiler doesn't know what to do with it/ have to give it
        //initial value
        while (retVal == null) {
            try {
                String input = Utilities.stringInput();
                if (input == null) {
                    renderError();
                    render();
                    continue;
                }

                retVal = UUID.fromString(input); //converts UUID from a string
                if (retVal == null) {
                    renderError();
                    render();
                    continue;
                }

                return retVal;
            } catch (IllegalArgumentException e) {
                renderError();
                render();
                continue;
            }
        }
        return retVal;
    }

} */
