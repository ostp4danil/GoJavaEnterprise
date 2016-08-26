package com.goit.gojavaonline.enterprise.generics.buildings;

/**
 * Created by Danil-MAC on 8/24/16.
 */
public class House extends Building{

    private int population;

    public House(int age, int square, String genre, int population) {
        super(age, square, genre);
        this.population = population;
    }
}
