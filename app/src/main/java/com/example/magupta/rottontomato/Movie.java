package com.example.magupta.rottontomato;

import java.util.ArrayList;

/**
 * Created by magupta on 10/20/15.
 */

// Model
public class Movie {
    public String title;
    public String posterUrl;
    public float criticScore;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getCriticScore() {
        return criticScore + "%";
    }

    public void setCriticScore(float criticScore) {
        this.criticScore = criticScore;
    }

    public Movie(String title, String posterUrl, float criticScore) {
        this.title = title;
        this.posterUrl = posterUrl;
        this.criticScore = criticScore;
    }

    // Returns 3 Fake Movies
    public static ArrayList<Movie> getFakeMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Fantastic Four", "bar", 45.0f));
        movies.add(new Movie("Interstellar", "bar", 70.0f));
        movies.add(new Movie("Inside Out", "bar", 95.0f));
        return movies;
    }
}
