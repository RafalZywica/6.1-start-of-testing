package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

public class StreamMain {
    private static String titles = "";
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().forEach((list, value) -> value.forEach(title -> titles += title + "!"));
        System.out.println(titles);
    }
}

