package com.example;

/**
 * Created by zzj on 2017/5/9.
 */

public class Rental {
    private Movie mMovie;
    private int mDaysRented;

    public Rental(Movie mMovie, int mDaysRented) {
        this.mMovie = mMovie;
        this.mDaysRented = mDaysRented;
    }

    public Movie getmMovie() {
        return mMovie;
    }

    public int getmDaysRented() {
        return mDaysRented;
    }

    public void setmMovie(Movie mMovie) {
        this.mMovie = mMovie;
    }

    public void setmDaysRented(int mDaysRented) {
        this.mDaysRented = mDaysRented;
    }

    public double getCharge() {
        return getmMovie().getCharge(getmDaysRented());
    }

    public int getFrequentRenterPoints(){
        return getmMovie().getFrequentRenterPoints(getmDaysRented());
    }
}
