package com.julia.dart.model;

import java.util.UUID;

public class DartCustomer {
    //declaration of variables
    private UUID mId;
    private String mName;

    //information stored for specific DartCustomer
    public DartCustomer( String name ) {
        mId = UUID.randomUUID();    //randomized id for each user
        mName = name;   //name of user
    }
    ////states what is returned when DartCustomer is called
    public DartCustomer( UUID id, String name ) {
        mId = id;
        mName = name;
    }
    //states what is returned when the following methods are called
    public UUID getId() {
        return mId;
    }
    public String getName() {
        return mName;
    }
}
