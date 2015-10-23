package com.example.magupta.rottontomato;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by magupta on 10/20/15.
 */
public class MoviesAdapter extends ArrayAdapter<Movie> {

    public MoviesAdapter(Context context, ArrayList<Movie> movies) {
        super(context, 0, movies);
    }

    // Obj => View
    // convertView = Sad old view ( dirty View)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Movie movie = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_movie, parent, false);
        }
        // Lookup view for data population
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvScore = (TextView) convertView.findViewById(R.id.tvScore);
        // Populate the data into the template view using the data object
        tvTitle.setText(movie.title);
        tvScore.setText(movie.getCriticScore());
        // Return the completed view to render on screen
        return convertView;
    }
}
