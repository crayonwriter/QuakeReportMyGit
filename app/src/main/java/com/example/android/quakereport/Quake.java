package com.example.android.quakereport;

import android.content.Context;

import java.lang.reflect.Constructor;

/** @link Quake is a class that is used for each earthquake that occurs, and includes
 * the magnitude, the city, and the date of each earthquake.
 */

    public class Quake {

//Instantiate the states
    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;



    /**Constructor for the class
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */


    public Quake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;

    }

    //Declare the methods to get each state
    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
