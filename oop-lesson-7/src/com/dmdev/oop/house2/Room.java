package com.dmdev.oop.house2;

public class Room {

    private boolean room;

    Room(boolean room){
        this.room = room;
    }

    public boolean getRoom(){
        return room;
    }

    void printRoom(){
        System.out.println("комната проходная - " + room);
    }
}
