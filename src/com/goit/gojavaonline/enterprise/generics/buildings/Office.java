package com.goit.gojavaonline.enterprise.generics.buildings;

/**
 * Created by Danil-MAC on 8/24/16.
 */
public class Office extends Building{

    private int staff;

    public Office(int age, int square, String genre, int staff) {
        super(age, square, genre);
        this.staff = staff;
    }


}
