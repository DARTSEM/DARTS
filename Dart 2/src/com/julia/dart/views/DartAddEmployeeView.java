package com.julia.dart.views;

import com.julia.dart.Utilities;
import com.julia.dart.model.DartEmployee;

public class DartAddEmployeeView {
    public DartEmployee getEmployeeData() {
        String firstName, lastName, address1, address2;
        Integer birthYear;
        Double monthlySalary;

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

        DartEmployee employee = new DartEmployee( firstName, lastName, birthYear, address1, address2, monthlySalary );

        return employee;
    }

    public void renderSuccess() {
        System.out.println("Successfully registered:\n" );
        // output as <ID> : <Employee Name> - <birth year> ( <age> ): <Gross Salary> SEK.
    }

}
