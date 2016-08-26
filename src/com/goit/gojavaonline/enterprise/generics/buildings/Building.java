package com.goit.gojavaonline.enterprise.generics.buildings;

public abstract class Building {

    private int age;
    private int square;
    private String genre;

    public Building(int age, int square, String genre) {
        this.age = age;
        this.square = square;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Building: " +
                "age=" + age +
                ", square=" + square +
                ", genre='" + genre + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getSquare() {
        return square;
    }

    public String getGenre() {
        return genre;
    }
}
