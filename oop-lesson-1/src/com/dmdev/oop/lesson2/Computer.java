package com.dmdev.oop.lesson2;

public class Computer {
    private int ssd = 500;
    private int ram;
    public Computer(){
        System.out.println("Я был создан");
    }
    Computer(int newSSD) {
        ssd = newSSD;
        ram = 0;
    }

     protected Computer(int newSSD, int newRam) {
        ssd = newSSD;
        ram = newRam;
    }
    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }
    }
    void printState() {
        System.out.println("SSD: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
