package com.julia.dart.model;

import java.util.UUID;

public class DartProduct {
    private UUID mId;
    private String mTitle;
    private String mGenre;
    private Double mDailyRentFee;
    private DartProductType mProductType;

    public DartProduct( String title, String genre, Double dailyRentFee, DartProductType productType ) {
        mId = UUID.randomUUID();
        mTitle = title;
        mGenre = genre;
        mDailyRentFee = dailyRentFee;
        mProductType = productType;
    }

    public DartProduct( UUID id, String title, String genre, Double dailyRentFee, DartProductType productType ) {
        mId = id;
        mTitle = title;
        mGenre = genre;
        mDailyRentFee = dailyRentFee;
        mProductType = productType;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getGenre() {
        return mGenre;
    }

    public Double getDailyRentFee() {
        return mDailyRentFee;
    }

    public DartProductType getProductType() {
        return mProductType;
    }
}
