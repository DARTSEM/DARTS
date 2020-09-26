package com.julia.dart.model;

import java.util.UUID;
import java.time.LocalDate;

public class DartEmployee {
    private UUID mId;

    private String mFirstName;
    private String mLastName;


    private Integer mBirthYear;

    private String mAddress1;
    private String mAddress2;

    private Double mMonthlySalary;

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

    public DartEmployee( UUID id, String firstName, String lastName, Integer birthYear, String address1,
                         String address2, Double monthlySalary ) {
        mId = id;
        mFirstName = firstName;
        mLastName = lastName;
        mBirthYear = birthYear;
        mAddress1 = address1;
        mAddress2 = address2;
        mMonthlySalary = monthlySalary;
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mFirstName + " " + mLastName;
    }

    public Integer getBirthYear() {
        return mBirthYear;
    }

    public Integer getAge() {
        return LocalDate.now().getYear() - getBirthYear();
    }

    public String getAddress() {
        return mAddress1 + "\r\n" + mAddress2;
    }

    public Double getMonthlySalary() {
        return mMonthlySalary;
    }

    public Double calculateBonusSalary() {

        Double bonusSalary = 4000.0;
        Integer age = getAge();

        if (age >= 22 && age <= 30) {
            bonusSalary = 6000.0;
        } else if (age > 30) {
            bonusSalary = 7500.0;
        }
        return bonusSalary;
    }

    public Double calculateNetSalary() {
        Double netSalary = getMonthlySalary() * 12;

        if (netSalary >= 100000) {
            netSalary *= 0.7;
        }
        return netSalary + calculateBonusSalary();
    }

    @Override
    public String toString() {
        return getId() + " : " + getName() + " " + getBirthYear() + " (" + getAge() + " years old) " +
                calculateNetSalary() + " SEK.";
    }
}
