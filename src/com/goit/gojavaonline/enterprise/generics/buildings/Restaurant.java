package com.goit.gojavaonline.enterprise.generics.buildings;

/**
 * Created by Danil-MAC on 8/24/16.
 */
public class Restaurant extends Building{

    private int dayAverageVisitors;

    public Restaurant(int age, int square, String genre, int dayAverageVisitors) {
        super(age, square, genre);
        this.dayAverageVisitors = dayAverageVisitors;
    }

}
