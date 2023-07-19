package com.dmdev.oop.house;

public class HouseRunner {


    public static void main(String[] args) {
        House house1 = new House(1, new int[] {1, 2, 3, 4, 5});
        Level level1 = new Level(house1.levels[0], new int[] {1, 2, 3});
        Level level2 = new Level(house1.levels[1], new int[] {1, 2, 3});
        Level level3 = new Level(house1.levels[2], new int[] {1, 2, 3});
        Level level4 = new Level(house1.levels[3], new int[] {1, 2, 3});
        Level level5 = new Level(house1.levels[4], new int[] {1, 2, 3});
        Apartment apartment1 = new Apartment(level1.apartments[0], new int[] {1, 2, 3});
        Apartment apartment2 = new Apartment(level1.apartments[1], new int[] {1, 2, 3});
        Apartment apartment3 = new Apartment(level1.apartments[2], new int[] {1, 2, 3});


        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        room1.room_can_int = true;
        room2.room_can_int = false;
        room3.room_can_int = true;


        printAllInfo(house1, level1, level2,level3,level4,level5, apartment1, room1);

    }

    private static void printAllInfo(House house1, Level level1,Level level2,Level level3,Level level4,Level level5, Apartment apartment1, Room room1) {
        house1.printHouse();
        level1.printLevel();
        level2.printLevel();
        level3.printLevel();
        level4.printLevel();
        level5.printLevel();
        apartment1.printApartment();
        room1.printRoom();
    }
}
