package com.example.magupta.rottontomato;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {

    /*
    1. Create Model class => Movie
    2. Create Item Layout File
    3. Add List View
    4. Create List Adapter
    5. Set Adapter
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        ArrayList<Movie> movies = Movie.getFakeMovies();


        //1. Get ListView Reference
        ListView lvMovies = (ListView) findViewById(R.id.lvMovies);

        //2. Create New Adapter instance
        MoviesAdapter adapter = new MoviesAdapter(MoviesActivity.this, movies);

        //3. Set adapter
        lvMovies.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
