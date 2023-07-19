package com.dmdev.oop.house;

public class Apartment {

    int apartment;

    int[] rooms;

    public Apartment(int a, int[] r) {
        apartment = a;
        rooms = r;
    }
    void printApartment(){
        System.out.println("Квартира " + apartment + ", количество комнат " + rooms.length);
    }
}
