package com.julia.dart.views;
import com.julia.dart.Utilities;
import com.julia.dart.model.DartCustomer;

public class DartAddCustomerView {
    public DartCustomer getCustomerData() {
        String name;

        System.out.println(Utilities.line() + "Creating a Customer. Please type the customer's:\n" +
                "Name:\n");
        name = Utilities.stringInput();

        DartCustomer customer = new DartCustomer(name);

        return customer;
    }

    public void renderSuccess() {
        System.out.println("Successfully registered a customer!");
    }
}
