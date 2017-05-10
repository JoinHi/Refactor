package com.example;

/**
 * Created by zzj on 2017/5/9.
 */

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String mTitle;
    private Price mPrice;

    public Movie(String mTitle, int mPriceCode) {
        this.mTitle = mTitle;
        setmPriceCode(mPriceCode);
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmPriceCode() {
        return mPrice.getPriceCode();
    }

    public void setmPriceCode(int mPriceCode) {
        switch (mPriceCode){
            case REGULAR:
                mPrice = new RegularPrice();
                break;
            case CHILDRENS:
                mPrice = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                mPrice = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public double getCharge(int daysRented){
        return mPrice.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented){
        return mPrice.getFrequentRenterPoints(daysRented);
    }
}
