package com.dmdev.oop.house;

import com.dmdev.oop.lesson7.Ram;
import com.dmdev.oop.lesson7.Ssd;

public class House {


    int house;

    int[] levels;

    public House(int h, int[] l) {
        house = h;
        levels = l;
    }

    void printHouse(){
        System.out.println("Дом " + house + ", количество этажей " + levels.length);
    }
}
