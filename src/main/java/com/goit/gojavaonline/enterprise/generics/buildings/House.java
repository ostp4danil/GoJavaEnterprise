package com.goit.gojavaonline.enterprise.generics.buildings;

/**
 * Created by Danil-MAC on 8/24/16.
 */
public class House extends Building{

    private int population;

    public House(int age, int square, int height, String genre, int population) {
        super(age, square, height,  genre);
        this.population = population;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "population=" + population +
                '}';
    }
}
