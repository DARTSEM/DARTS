package com.julia.dart.model;

import java.util.Collection;
import java.util.UUID;

public class DartProduct {
    private UUID mId;
    private String mTitle;
    private String mGenre;
    private Double mDailyRentFee;
    private DartProductType mProductType;
    private static Boolean mAvailable; // why is this static?

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

    public static void rentProduct() { mAvailable = false; }

    public static void returnProduct() { mAvailable = true; }

    public static void showAllGames(Collection<DartProduct> productList){
        for (DartProduct product : productList) {
            System.out.println(product);
        }
    }
    public String getAvailable() {
        if (mAvailable == true) {
            return "AVAILABLE";
        } else {
            return "UNAVAILABLE";
        }
    }

    @Override
    public String toString() {
        return getId() + " : " + getTitle() + " (" + getGenre() + " " + getProductType() + ") " +
                getDailyRentFee() + " SEK/day. - " + getAvailable();
    }

    //Output
}
