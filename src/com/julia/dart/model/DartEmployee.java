package com.julia.dart.model;

import java.util.UUID;

public class DartEmployee {
    //Declaration of variables
    private UUID mId;

    private String mFirstName;
    private String mLastName;

    private Integer mBirthYear;

    private String mAddress1;
    private String mAddress2;

    private Double mMonthlySalary;

    //Data assigned for specific DartEmployee
    public DartEmployee( String firstName, String lastName, Integer birthYear, String address1, String address2,
                         Double monthlySalary ) {
        mId = UUID.randomUUID();
        mFirstName = firstName;
        mLastName = lastName;
        mBirthYear = birthYear;
        mAddress1 = address1;
        mAddress2 = address2;
        mMonthlySalary = monthlySalary;
    }

    //Data stored for specific DartEmployee
    public DartEmployee( UUID id, String firstName, String lastName, Integer birthYear, String address1, String address2,
                         Double monthlySalary ) {
        mId = id;
        mFirstName = firstName;
        mLastName = lastName;
        mBirthYear = birthYear;
        mAddress1 = address1;
        mAddress2 = address2;
        mMonthlySalary = monthlySalary;
    }
    //states data returned when the following functions are called
    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mFirstName + " " + mLastName;
    }

    public Integer getBirthYear() {
        return mBirthYear;
    }

    public String getAddress() {
        return mAddress1 + "\r\n" + mAddress2;
    }

    public Double getmMonthlySalary() {
        return mMonthlySalary;
    }
}
