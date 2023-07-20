package com.dmdev.oop.house2;

public class Apartment {

    private int apartment;

    private Room[] rooms;

    public Apartment(int apartment, Room[] rooms){
        this.apartment = apartment;
        this.rooms = rooms;
    }

    public int getApartment(){
        return apartment;
    }

    public Room[] getNumberOfRooms(){
        return rooms;
    }

    void printApartment(){
        System.out.println("Квартира " + apartment + ", количество комнат " + rooms.length);
    }
}
