package com.dmdev.lesson11;

public class OopLessonRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
//        Computer computer = new Computer(ssd, ram);
//        computer.load();

        Laptop laptop = new Laptop(new Ssd(1080), new Ram(1000), 2);
        laptop.open();
        laptop.load();
    }
}
