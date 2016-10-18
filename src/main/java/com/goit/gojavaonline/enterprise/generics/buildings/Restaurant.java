package com.goit.gojavaonline.enterprise.generics.buildings;

/**
 * Created by Danil-MAC on 8/24/16.
 */
public class Restaurant extends Building {

    private int dayAverageVisitors;

    public Restaurant(int age, int square, int height, String genre, int dayAverageVisitors) {
        super(age, square, height, genre);
        this.dayAverageVisitors = dayAverageVisitors;
    }

    @Override
    public String toString() {
        return "Restaurant{" + super.toString() +
                "dayAverageVisitors=" + dayAverageVisitors +
                '}';
    }
}
