package com.example;

import java.util.ArrayList;

/**
 * Created by zzj on 2017/5/9.
 */

public class Customer {
    private String mName;
    private ArrayList<Rental> mRentals = new ArrayList<>();

    public Customer(String mName) {
        this.mName = mName;
    }

    public void addRental(Rental rental) {
        mRentals.add(rental);
    }

    public String getmName() {
        return mName;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getmName() + "\n";
        for (Rental rental : mRentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
            result += "\t" + rental.getmMovie().getmTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
            totalAmount += rental.getCharge();
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

}
