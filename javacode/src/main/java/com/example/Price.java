package com.example;

/**
 * Created by zzj on 2017/5/10.
 */

public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
