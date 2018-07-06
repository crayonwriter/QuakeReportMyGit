package com.example.android.quakereport;

import android.content.Context;

/** @link Quake is a class that is used for each earthquake that occurs, and includes
 * the magnitude, the city, and the date of each earthquake.
 */

    public class Quake {

//Instantiate the states
    private String mMagnitude;
    private String mCity;
    private String mDate;
    private Context mCcontext;



    //Constructor for the class
    public Quake(String magnitude, String city, String date) {
        mMagnitude = magnitude;
        mCity = city;
        mDate = date;
    }

    //Declare the methods to get each state
    public String getMagnitude() {
        return mMagnitude;
    }

    public String getCity() {
        return mCity;
    }

    public String getDate() {
        return mDate;
    }
}
