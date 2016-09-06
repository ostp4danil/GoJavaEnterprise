package com.goit.gojavaonline.enterprise.generics.buildings;

public abstract class Building {

    private int age;
    private int square;
    private int height;
    private double volume;
    private String genre;


    public Building(int age, int square, int height, String genre) {
        this.age = age;
        this.square = square;
        this.genre = genre;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Building{" +
                "age=" + age +
                ", square=" + square +
                ", height=" + height +
                ", volume=" + volume +
                ", genre='" + genre + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getSquare() {
        return square;
    }

    public int getHeight() {
        return height;
    }

    public String getGenre() {
        return genre;
    }

    public double getCapacity() {
        return volume;
    }

    public void setCapacity(double volume) {
        this.volume = volume;
    }
}
