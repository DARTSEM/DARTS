package com.julia.dart.views;

import com.julia.dart.Utilities;
import com.julia.dart.model.DartEmployee;

import java.util.Collection;

public class DartEmployeeDatabaseView {
    public void render(Collection<DartEmployee> employeeList){
        System.out.println(Utilities.line() + "Employee Database - Type one of the options below:\n" +
            "1. Search employee\n" +
            "2. Remove employee\n");
    }


}
