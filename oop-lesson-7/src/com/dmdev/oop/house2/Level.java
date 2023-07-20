package com.dmdev.oop.house2;

public class Level {

    private int level;

    private Apartment[] apartments;

    public Level(int level, Apartment[] apartments){
        this.level = level;
        this.apartments = apartments;
    }

    public int getLevel(){
        return level;
    }

    public Apartment[] getNumOfApartments(){
        return apartments;
    }

    void printLevel(){
        System.out.println("Этаж " + level + ", количество квартир " + apartments.length);
    }
}
