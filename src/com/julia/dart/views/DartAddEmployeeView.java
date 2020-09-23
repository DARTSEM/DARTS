package com.julia.dart.views;

import com.julia.dart.Utilities;
import com.julia.dart.model.DartEmployee;

public class DartAddEmployeeView {
    public DartEmployee getEmployeeData() {
        //Declaration of variables
        String firstName, lastName, address1, address2;
        Integer birthYear;
        Double monthlySalary;

        //Output and input to console/ screen & assigning input data to variables
        System.out.println(Utilities.line() + "Please enter the first name:\n" );
        firstName = Utilities.stringInput();
        System.out.println(Utilities.line() + "Please enter the last name:\n" );
        lastName = Utilities.stringInput();
        System.out.println(Utilities.line() + "Please enter the year of birth:\n" );
        birthYear = Utilities.intInput();
        System.out.println(Utilities.line() + "Please enter the first address line:\n" );
        address1 = Utilities.stringInput();
        System.out.println(Utilities.line() + "Please enter the second address line:\n" );
        address2 = Utilities.stringInput();
        System.out.println(Utilities.line() + "Please enter the monthly salary:\n" );
        monthlySalary = Utilities.doubleInput();

        //Assigning data from variables into new DartEmployee
        DartEmployee employee = new DartEmployee( firstName, lastName, birthYear, address1, address2, monthlySalary );

        return employee;
    }
    //Success message shown upon new DartEmployee creation
    public void renderSuccess() {
        System.out.println("Successfuly registered an employee!");
    }

}
