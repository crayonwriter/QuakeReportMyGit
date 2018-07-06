package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<Quake> {
    private static final String LOG_TAG = QuakeAdapter.class.getSimpleName();

    public QuakeAdapter (Activity context, ArrayList<Quake> earthquakes) {
        super(context, 0, earthquakes);
    }
    @NonNull
    @Override
    //This manually handles the inflation of the layout, which is why 0 was entered above for the resource

    /**
     * Provides a view for an AdapterView
     * @param position The adapterview position requesting a view
     * @param convertView The recycled view to populate
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The view for the position in the AdapterView
     */
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, or else inflate it
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Quake} object located at this position in the list
        Quake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the version name from the current earthquake object and
        // set this text on the name TextView
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID city
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.City);
        // Get the version name from the current earthquake object and
        // set this text on the name TextView
        cityTextView.setText(currentEarthquake.getCity());

        // Find the TextView in the list_item.xml layout with the ID city
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.Date);
        // Get the version name from the current earthquake object and
        // set this text on the name TextView
        dateTextView.setText(currentEarthquake.getDate());

        return listItemView;
        }


}
