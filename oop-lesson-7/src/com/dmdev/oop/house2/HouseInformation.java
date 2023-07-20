package com.dmdev.oop.house2;

public class HouseInformation {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(true);
        Apartment apart1 = new Apartment(10, new Room[3]);
        Apartment apart2 = new Apartment(24, new Room[4]);
        Level level1 = new Level(1, new Apartment[3]);
        Level level2 = new Level(2, new Apartment[4]);
        House house1 = new House(1, new Level[5]);
//        House house2 = new House(1, new Level[5]);

        House house2 = new House(3, new Level[5], level2, apart1, room3);


        house1.printHouse();
        house2.printAllInformation();
    }
}
