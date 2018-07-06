package com.example.android.quakereport;

import android.content.Context;

/** @link Quake is a class that is used for each earthquake that occurs, and includes
 * the magnitude, the city, and the date of each earthquake.
 */

    public class Quake {

//Instantiate the states
    private Double magnitude;
    private String city;
    private String date;
    private Context context;



    //Constructor for the class
    public Quake(double magnitude, String city, String date) {
        magnitude = 0.0;
        city = "";
        date = "";
    }

    //Declare the methods to get each state
    public String getMagnitude() {
        return magnitude.toString();
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }
}
