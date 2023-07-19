package com.dmdev.oop.house;

public class Level {
    int level;

    int[] apartments;

    public Level(int l, int[] a) {
        level = l;
        apartments = a;
    }

    void printLevel(){
        System.out.println("Этаж " + level + ", количество квартир " + apartments.length);
    }
}
