package com.julia.dart.model;

import java.util.UUID;

public class DartCustomer {
    private UUID mId;
    private String mName;

    public DartCustomer( String name ) {
        mId = UUID.randomUUID();
        mName = name;
    }

    public DartCustomer( UUID id, String name ) {
        mId = id;
        mName = name;

    }
    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }
}
