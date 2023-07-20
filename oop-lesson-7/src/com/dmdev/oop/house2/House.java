package com.dmdev.oop.house2;

public class House {

    private int house;

    private Level[] levels;

    private Level level;

    private Apartment apartment;

    private Room room;

    public House(int house, Level[] levels) {
          this.house = house;
          this.levels = levels;
    }

    public House(int house, Level[] levels, Level level, Apartment apartment, Room room) {
        this.house = house;
        this.levels = levels;
        this.level = level;
        this.apartment = apartment;
        this.room = room;
    }

    void printHouse(){
        System.out.println("Дом " + house + ", количество этажей " + levels.length);
    }

    void printAllInformation(){
        printHouse();
        this.level.printLevel();
        this.apartment.printApartment();
        this.room.printRoom();

    }
}
