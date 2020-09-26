package com.julia.dart.model;

import java.util.UUID;

public class DartProduct {
    private UUID mId;
    private String mTitle;
    private String mGenre;
    private Double mDailyRentFee;
    private DartProductType mProductType;
    private Boolean mAvailable;

    public DartProduct( String title, String genre, Double dailyRentFee, DartProductType productType ) {
        mId = UUID.randomUUID();
        mTitle = title;
        mGenre = genre;
        mDailyRentFee = dailyRentFee;
        mProductType = productType;
        mAvailable = true;
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

    public void rentProduct() { mAvailable = false; }

    public void returnProduct() { mAvailable = true; }




    //Output

}
