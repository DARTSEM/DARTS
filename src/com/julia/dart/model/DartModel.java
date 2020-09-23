package com.julia.dart.model;

import java.util.*;

public class DartModel {
    //key and value stored for member variables
    public HashMap<UUID, DartCustomer> mCustomers;
    public HashMap<UUID, DartProduct> mProducts;
    public HashMap<UUID, DartEmployee> mEmployees;

    //Creating new instances of member variables, assigning ID and other variables
    public DartModel() {
        mCustomers = new HashMap<UUID, DartCustomer>();
        mProducts = new HashMap<UUID, DartProduct>();
        mEmployees = new HashMap<UUID, DartEmployee>();
    }
    //returns data stored for all DartCustomers
    public Collection<DartCustomer> getCustomerList() {
        return mCustomers.values();
    }
    //Adds customer
    public void addCustomer( DartCustomer customer ) {
        mCustomers.put( customer.getId(), customer );
    }
    //Removes customer via id
    public void removeCustomer( UUID id ) {
        mCustomers.remove( id );
    }
    //Returns customer via ID inquiry
    public DartCustomer getCustomerById( UUID id ) {
        return mCustomers.get(id);
    }
    //Returns data of specific product
    public Collection<DartProduct> getProductList() {
        return mProducts.values();
    }
    //Adds product
    public void addProduct( DartProduct product ) {
        mProducts.put(product.getId(), product);
    }
    //Removes product via ID inquiry
    public void removeProduct( UUID id ) {
        mProducts.remove( id );
    }
    //Returns data of specific profuct
    public DartProduct getProductById( UUID id ) {
        return mProducts.get( id );
    }
    //Returns all employees
    public Collection<DartEmployee> getEmployeeList() {
        return mEmployees.values();
    }
    //Adds employee
    public void addEmployee( DartEmployee employee ) {
        mEmployees.put(employee.getId(), employee);
    }
    //Removes employee
    public void removeEmployee( UUID id ) {
        mEmployees.remove( id );
    }
    //Returns employee data via ID inquiry
    public DartEmployee getEmployeeById( UUID id ) {
        return mEmployees.get(id );
    }
}
