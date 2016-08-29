package com.goit.gojavaonline.enterprise.generics.buildings;

/**
 * Created by Danil-MAC on 8/24/16.
 */
public class Office extends Building{

    private int staff;

    public Office(int age, int square, int height, String genre, int staff) {
        super(age, square,height, genre);
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Office{" + super.toString() +
                "staff=" + staff +
                '}';
    }
}
