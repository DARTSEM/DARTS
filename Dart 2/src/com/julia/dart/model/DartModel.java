package com.julia.dart.model;

import java.time.LocalDate;
import java.util.*;

public class DartModel {

    public HashMap<UUID, DartCustomer> mCustomers;
    public HashMap<UUID, DartProduct> mProducts;
    public HashMap<UUID, DartEmployee> mEmployees;
    public ArrayList<DartRental> mRentals;

    public DartModel() {
        mCustomers = new HashMap<UUID, DartCustomer>();
        mProducts = new HashMap<UUID, DartProduct>();
        mEmployees = new HashMap<UUID, DartEmployee>();
        mRentals = new ArrayList<DartRental>();
    }

    public Collection<DartCustomer> getCustomerList() {
        return mCustomers.values();
    }

    public void addCustomer( DartCustomer customer ) {
        mCustomers.put( customer.getId(), customer );
    }
s
    public void removeCustomer( UUID id ) {
        mCustomers.remove( id );
    }

    public DartCustomer getCustomerById( UUID id ) {
        return mCustomers.get(id);
    }

    public Collection<DartProduct> getProductList() {
        return mProducts.values();
    }

    public void addProduct( DartProduct product ) {
        mProducts.put(product.getId(), product);
    }

    public void removeProduct( UUID id ) {
        mProducts.remove( id );
    }

    public DartProduct getProductById( UUID id ) {
        return mProducts.get( id );
    }

    public Collection<DartEmployee> getEmployeeList() {
        return mEmployees.values();
    }

    public void addEmployee( DartEmployee employee ) {
        mEmployees.put(employee.getId(), employee);
    }

    public void removeEmployee( UUID id ) {
        mEmployees.remove( id );
    }

    public DartEmployee getEmployeeById( UUID id ) {
        return mEmployees.get(id );
    }

    public void rentProduct(DartCustomer customer, DartProduct product, LocalDate rentDate) {
        DartRental rental = new DartRental(customer, product, rentDate);

        mRentals.add(rental);
    }

    public void returnProduct(DartRental rental, LocalDate returnDate) {
        rental.returnRental(returnDate);
    }
}

